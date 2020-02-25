package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.dto.in.AdministratorLoginDTO;
import com.bw.jcart_administration_back.dto.in.GetProfileDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/administrator")
public class AdministratorController {
    // 登录
    @GetMapping("/login")
    public String login(AdministratorLoginDTO administratorLoginDTO){
        return null;
    }
    // 管理员获取Profile
    @GetMapping("/getProfile")
    public GetProfileDTO getProfile(){
        return null;
    }
}
