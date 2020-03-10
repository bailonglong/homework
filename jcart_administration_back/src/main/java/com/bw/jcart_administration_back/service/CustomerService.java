package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.dto.in.CustomerSearchInDTO;
import com.bw.jcart_administration_back.dto.in.CustomerSetStatusInDTO;
import com.bw.jcart_administration_back.po.Customer;
import com.github.pagehelper.Page;

public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
