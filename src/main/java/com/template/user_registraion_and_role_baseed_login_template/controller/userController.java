package com.template.user_registraion_and_role_baseed_login_template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {


    @GetMapping("/user")
    public String normalUser(){
        return "User/user";
    }

    @GetMapping("/admin")
    public String adminUser(){
        return "Admin/admin";
    }

}
