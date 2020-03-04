package com.bw.jcart_administration_back.service.impl;

import com.bw.jcart_administration_back.dao.OrderDetailMapper;
import com.bw.jcart_administration_back.dao.OrderMapper;
import com.bw.jcart_administration_back.dto.in.OrderCheckoutInDTO;
import com.bw.jcart_administration_back.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
    @Override
    public Integer createout(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId) {
        return null;
    }
}
