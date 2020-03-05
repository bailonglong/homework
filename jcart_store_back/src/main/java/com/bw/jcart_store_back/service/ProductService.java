package com.bw.jcart_store_back.service;


import com.bw.jcart_store_back.dto.out.ProductListOutDTO;
import com.bw.jcart_store_back.dto.out.ProductShowOutDTO;
import com.bw.jcart_store_back.po.Product;
import com.github.pagehelper.Page;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
