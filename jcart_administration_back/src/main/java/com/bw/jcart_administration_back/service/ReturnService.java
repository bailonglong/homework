package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.dto.in.ReturnSearchInDTO;
import com.bw.jcart_administration_back.po.Return;
import com.github.pagehelper.Page;

public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
