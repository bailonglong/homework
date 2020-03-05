package com.bw.jcart_administration_back.service;


import com.bw.jcart_administration_back.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}
