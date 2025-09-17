package com.desarrollo.spring.complexivo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String getForAuth(){
        return "auth/login";
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
