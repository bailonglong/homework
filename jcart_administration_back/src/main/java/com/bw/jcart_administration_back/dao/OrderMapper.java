package com.bw.jcart_administration_back.dao;


import com.bw.jcart_administration_back.dto.out.OrderListOutDTO;
import com.bw.jcart_administration_back.po.Order;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

//    custom

    Page<OrderListOutDTO> search();
}