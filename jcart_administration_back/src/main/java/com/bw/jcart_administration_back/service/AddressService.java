package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.po.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressService {
    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    void delete(Integer addressId);

}
