package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.po.Administrator;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUesername(String username);

    void update(Administrator administrator);
}
