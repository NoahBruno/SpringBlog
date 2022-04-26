package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    @GetMapping("/login")
    public String login(){
        return "users/login";
    }
}
