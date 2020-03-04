package com.bw.jcart_administration_back.service.impl;

import com.alibaba.fastjson.JSON;
import com.bw.jcart_administration_back.dao.OrderDetailMapper;
import com.bw.jcart_administration_back.dao.OrderMapper;
import com.bw.jcart_administration_back.dto.in.OrderCheckoutInDTO;
import com.bw.jcart_administration_back.dto.in.OrderProductInDTO;
import com.bw.jcart_administration_back.enumeration.OrderStatus;
import com.bw.jcart_administration_back.po.Address;
import com.bw.jcart_administration_back.po.Order;
import com.bw.jcart_administration_back.po.OrderDetail;
import com.bw.jcart_administration_back.po.Product;
import com.bw.jcart_administration_back.service.AddressService;
import com.bw.jcart_administration_back.service.OrderService;
import com.bw.jcart_administration_back.service.ProductService;
import com.bw.jcart_administration_back.vo.OrderProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Autowired
    private ProductService  productService;
    @Autowired
    private AddressService addressService;
    @Transactional
    @Override
    public Long checkeout(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId) {
        List<OrderProductInDTO> orderProducts = orderCheckoutInDTO.getOrderProducts();
        List<OrderProductVo> vos = orderProducts.stream().map(orderProduct -> {
            Product orderProdu = productService.getById(orderProduct.getProductId());

            OrderProductVo orderProductVo = new OrderProductVo();

            orderProductVo.setProductId(orderProdu.getProductId());
            orderProductVo.setProductCode(orderProdu.getProductCode());
            orderProductVo.setProductName(orderProdu.getProductName());
            orderProductVo.setQuantity(orderProduct.getQuantity());
            Double unitPrice = orderProdu.getPrice() * orderProdu.getDiscount();
            orderProductVo.setUnitPrice(unitPrice);
            Double totalPrice = unitPrice * orderProduct.getQuantity();
            orderProductVo.setTotalPrice(totalPrice);
            Integer unitRewordPoins = orderProdu.getRewordPoints();
            orderProductVo.setUnitRewordPoints(unitRewordPoins);
            Integer totalRewordPoints = orderProdu.getRewordPoints();
            orderProductVo.setUnitRewordPoints(totalRewordPoints);

            return orderProductVo;
        }).collect(Collectors.toList());

        double AllTotalPrice = vos.stream().mapToDouble(p -> p.getTotalPrice()).sum();
        int sum = vos.stream().mapToInt(p -> p.getTotalRewordPoins()).sum();

        Order order = new Order();
        order.setCustomerId(customerId);
        order.setStatus((byte) OrderStatus.ToProcess.ordinal());
        order.setTotalPrice(AllTotalPrice);
        order.setRewordPoints(sum);
        Date date = new Date();
        order.setCreateTime(date);
        order.setUpdateTime(date);

        orderMapper.insertSelective(order);
        Long orderId = order.getOrderId();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(orderId);
        orderDetail.setShipMethod(orderCheckoutInDTO.getShipMethod());
        // todo calculata ship price with ship method
        orderDetail.setShipPrice(5.0);
        Address shipAddress = addressService.getById(orderCheckoutInDTO.getShipAddressId());
        orderDetail.setShipAddress(shipAddress.getContent());

        orderDetail.setPayMethod(orderCheckoutInDTO.getPayMethod());
        orderDetail.setInvoicePrice(AllTotalPrice);
        Address invoiceAddress = addressService.getById(orderCheckoutInDTO.getInvoiceAddressId());
        orderDetail.setInvoiceAddress(invoiceAddress.getContent());

        orderDetail.setComment(orderCheckoutInDTO.getComment());

        orderDetail.setOrderProducts(JSON.toJSONString(vos));
        orderDetailMapper.insertSelective(orderDetail);
        return orderId;
    }

}
