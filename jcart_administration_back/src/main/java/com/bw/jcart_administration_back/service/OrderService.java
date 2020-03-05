package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.dto.out.OrderListOutDTO;
import com.bw.jcart_administration_back.dto.out.OrderShowOutDTO;
import com.bw.jcart_administration_back.po.Order;
import com.github.pagehelper.Page;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
