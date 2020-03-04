package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.dto.in.OrderCheckoutInDTO;

public interface OrderService {
    Integer createout(OrderCheckoutInDTO orderCheckoutInDTO,Integer customerId);
}
