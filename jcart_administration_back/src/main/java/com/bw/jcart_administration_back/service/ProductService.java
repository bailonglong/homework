package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.dto.in.ProductCreateInDTO;
import com.bw.jcart_administration_back.dto.in.ProductUpdateInDTO;
import com.bw.jcart_administration_back.dto.out.ProductListOutDTO;
import com.bw.jcart_administration_back.dto.out.ProductShowOutDTO;
import com.github.pagehelper.Page;

import java.util.List;

public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
