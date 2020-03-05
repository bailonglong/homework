package com.bw.jcart_store_back.service;


import com.bw.jcart_store_back.dto.in.CustomerRegisterInDTO;
import com.bw.jcart_store_back.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);

}
