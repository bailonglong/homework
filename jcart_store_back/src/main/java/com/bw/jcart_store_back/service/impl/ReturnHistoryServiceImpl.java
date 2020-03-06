package com.bw.jcart_store_back.service.impl;

import com.bw.jcart_store_back.dao.ReturnHistoryMapper;
import com.bw.jcart_store_back.po.ReturnHistory;
import com.bw.jcart_store_back.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);
        return returnHistories;
    }
}
