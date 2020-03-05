package com.bw.jcart_store_back.service;


import com.bw.jcart_store_back.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
