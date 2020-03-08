package com.bw.jcart_administration_back.service;

import com.bw.jcart_administration_back.po.Administrator;
import com.github.pagehelper.Page;

import java.util.List;

public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);
	
	Administrator getByEmail(String email);

    Integer create(Administrator administrator);

    void update(Administrator administrator);

    void delete(Integer administratorId);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);

}
