package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.dto.in.ReturnHistoryCreateInDTO;
import com.bw.jcart_administration_back.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        return null;
    }

}
