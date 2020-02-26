package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.constant.ClientExceptionConstant;
import com.bw.jcart_administration_back.exception.ClientException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/image")
public class ImageController {

    private List<String> imageExts = Arrays.asList("jpg","jpeg","png");
     // 图片上传
    @PostMapping("/upload")
    public String upload(MultipartFile file) throws ClientException {
        String filename = file.getOriginalFilename();

        String[] split = filename.split("\\.");

        String ext = split[split.length-1];

        ext = ext.toLowerCase();

        boolean contains = imageExts.contains(ext);
        if (!contains){
            throw new ClientException(ClientExceptionConstant.IMAGE_INVALID_ERRCODE, ClientExceptionConstant.IMAGE_INVALID_ERRMSG);
        }
        String uuid = UUID.randomUUID().toString();
        String fname = String.format("%s.%s",uuid,ext);
        String filepath = String.format("www/image/%s",fname);
        try(FileOutputStream out = new FileOutputStream(filepath)){
            byte[] data = file.getBytes();
            out.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fname;
    }

}
