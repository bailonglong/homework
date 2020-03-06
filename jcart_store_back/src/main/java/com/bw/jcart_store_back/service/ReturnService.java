package com.bw.jcart_store_back.service;

import com.bw.jcart_store_back.po.Return;
import com.github.pagehelper.Page;

public interface ReturnService {

    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);

}
