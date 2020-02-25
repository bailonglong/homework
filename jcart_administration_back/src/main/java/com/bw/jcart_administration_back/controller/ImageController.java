package com.bw.jcart_administration_back.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
@RequestMapping("/image")
public class ImageController {
    // 图片上传
    @PostMapping("/upload")
    public String upload(MultipartFile file){
        return null;
    }

}
