package com.example.web_learn_english.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homeWeb")
public class LoginController {
    @GetMapping("")
    public String showHomeWeb(){
        return "/user/main_screen";
    }

    @GetMapping("/signUpForm")
    public String showSignupForm(){
        return "/user/sign_up";
    }
    @GetMapping("/logInForm")
    public String showLogInForm(){
        return "/user/log_in";
    }
}
