package com.bw.jcart_administration_back.dao;


import com.bw.jcart_administration_back.po.ReturnHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReturnHistoryMapper {
    int deleteByPrimaryKey(Long returnHistoryId);

    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);

    ReturnHistory selectByPrimaryKey(Long returnHistoryId);

    int updateByPrimaryKeySelective(ReturnHistory record);

    int updateByPrimaryKey(ReturnHistory record);

    //    custom

    List<ReturnHistory> selectListByReturnId(@Param("returnId") Integer returnId);
}