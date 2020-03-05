package com.bw.jcart_administration_back.service;


import com.bw.jcart_administration_back.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
