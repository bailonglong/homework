package com.bw.jcart_administration_back.service.impl;

import com.bw.jcart_administration_back.dao.AdministratorMapper;
import com.bw.jcart_administration_back.po.Administrator;
import com.bw.jcart_administration_back.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {
    @Autowired
    private AdministratorMapper administratorMapper;

    @Override
    public Administrator getById(Integer administratorId) {
        Administrator administrator = administratorMapper.selectByPrimaryKey(administratorId);
        return administrator;
    }

    @Override
    public Administrator getByUesername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);
        return administrator;
    }


    @Override
    public void update(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }
}
