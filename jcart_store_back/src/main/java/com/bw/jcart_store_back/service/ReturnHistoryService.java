package com.bw.jcart_store_back.service;


import com.bw.jcart_store_back.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);

}
