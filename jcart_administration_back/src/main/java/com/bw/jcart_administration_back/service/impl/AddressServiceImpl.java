package com.bw.jcart_administration_back.service.impl;

import com.bw.jcart_administration_back.dao.AddressMapper;
import com.bw.jcart_administration_back.po.Address;
import com.bw.jcart_administration_back.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public Address getById(Integer addressId) {

        return addressMapper.selectByPrimaryKey(addressId);
    }

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        return null;
    }

    @Override
    public Integer create(Address address) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void delete(Integer addressId) {

    }
}
