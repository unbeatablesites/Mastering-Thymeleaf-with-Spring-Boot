package com.Frank_Uzoka.ThymeLeaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProductController {

        @RequestMapping("/product")
    public String getproduct(){
            return "product";
        }

}
