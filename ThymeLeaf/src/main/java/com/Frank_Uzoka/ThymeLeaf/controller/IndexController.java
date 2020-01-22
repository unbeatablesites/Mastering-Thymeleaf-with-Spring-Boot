package com.Frank_Uzoka.ThymeLeaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

        @RequestMapping("/")
    public String getIndex(){
            return "index";
        }

}
