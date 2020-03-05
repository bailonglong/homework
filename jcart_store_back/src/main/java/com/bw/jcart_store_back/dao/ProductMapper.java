package com.bw.jcart_store_back.dao;

import com.bw.jcart_store_back.dto.out.ProductListOutDTO;
import com.bw.jcart_store_back.po.Product;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

//    custom

    Page<ProductListOutDTO> search();

}