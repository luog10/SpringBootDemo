package com.pub.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home/")
public class homecontroller {
    @RequestMapping("index")
    public  String index(){
        return "home/index";
    }
}
