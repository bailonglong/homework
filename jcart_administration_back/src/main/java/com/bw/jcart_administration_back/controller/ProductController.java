package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.dto.in.ProductSearchInDTO;
import com.bw.jcart_administration_back.dto.out.PageOutDTO;
import com.bw.jcart_administration_back.dto.out.ProductListOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @PostMapping("/seatch")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, @RequestParam Integer pageNum){
        return  null;
    }


}
