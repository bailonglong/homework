package com.bw.jcart_administration_back.controller;

import com.bw.jcart_administration_back.dto.in.ReturnSearchInDTO;
import com.bw.jcart_administration_back.dto.in.ReturnUpdateActionInDTO;
import com.bw.jcart_administration_back.dto.out.PageOutDTO;
import com.bw.jcart_administration_back.dto.out.ReturnListOutDTO;
import com.bw.jcart_administration_back.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
