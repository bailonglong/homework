package com.bw.jcart_store_back.service;

import com.bw.jcart_store_back.dto.in.OrderCheckoutInDTO;
import com.bw.jcart_store_back.dto.out.OrderShowOutDTO;
import com.bw.jcart_store_back.po.Order;
import com.github.pagehelper.Page;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
