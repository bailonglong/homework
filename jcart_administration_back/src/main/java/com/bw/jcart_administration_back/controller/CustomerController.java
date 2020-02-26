package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.dto.in.CustomerSearchInDTO;
import com.bw.jcart_administration_back.dto.out.CustomerListOutDTO;
import com.bw.jcart_administration_back.dto.out.CustomerShowOutDTO;
import com.bw.jcart_administration_back.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }

}
