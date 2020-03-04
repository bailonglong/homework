package com.bw.jcart_administration_back.service.impl;

import com.bw.jcart_administration_back.dao.OrderDetailMapper;
import com.bw.jcart_administration_back.dao.OrderMapper;
import com.bw.jcart_administration_back.dto.in.OrderCheckoutInDTO;
import com.bw.jcart_administration_back.dto.in.OrderProductInDTO;
import com.bw.jcart_administration_back.dto.out.ProductShowOutDTO;
import com.bw.jcart_administration_back.enumeration.OrderStatus;
import com.bw.jcart_administration_back.po.Order;
import com.bw.jcart_administration_back.service.OrderService;
import com.bw.jcart_administration_back.service.ProductService;
import com.bw.jcart_administration_back.vo.OrderProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Override
    public Integer createout(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId) {
        List<OrderProductInDTO> orderProducts = orderCheckoutInDTO.getOrderProducts();
        List<OrderProductVo> vos = orderProducts.stream().map(orderProduct -> {
            ProductShowOutDTO orderProdu = productService.getById(orderProduct.getProductId());
            OrderProductVo orderProductVo = new OrderProductVo();
            orderProductVo.setProductId(orderProdu.getProductId());
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
        return null;
    }

}
