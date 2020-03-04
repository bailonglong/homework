package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.dto.in.OrderCheckoutInDTO;
import com.bw.jcart_administration_back.dto.in.OrderProductInDTO;
import com.bw.jcart_administration_back.dto.in.OrderSearchInDTO;
import com.bw.jcart_administration_back.dto.out.*;
import com.bw.jcart_administration_back.enumeration.OrderStatus;
import com.bw.jcart_administration_back.po.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, @RequestParam Integer pageNum){
        return null;
    }

    @PostMapping("/checkout")
    public Long checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                        @RequestAttribute Integer customerId){
        List<OrderProductInDTO> orderProducts = orderCheckoutInDTO.getOrderProducts();
        orderProducts.stream().map(orderProduct -> {
            Integer productId = orderProduct.getProductId();

        })


        Order order = new Order();
        order.setCustomerId(customerId);
        order.setStatus((byte) OrderStatus.ToProcess.ordinal());
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestParam(required = false,defaultValue = "1") Integer pageNum,@RequestParam Integer customerId){
        return null;
    }


    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId){
        return null;
    }

}
