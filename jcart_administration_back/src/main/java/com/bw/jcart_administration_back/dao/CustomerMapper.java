package com.bw.jcart_administration_back.dao;


import com.bw.jcart_administration_back.po.Customer;
import com.github.pagehelper.Page;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

//    custom

    Page<Customer> search();

}