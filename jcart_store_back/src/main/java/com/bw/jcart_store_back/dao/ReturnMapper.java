package com.bw.jcart_store_back.dao;


import com.bw.jcart_store_back.po.Return;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);

    Page<Return> selectPageByCustomerId(Integer customerId);
}