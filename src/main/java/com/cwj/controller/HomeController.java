package com.cwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("home")
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "/index";
    }

}
