package com.server.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.server.dto.login.SingInDTO;
import com.server.server.dto.login.SingUpDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/token")
    public String generateToken() {
        return "Token generated";
    }
    @PostMapping("/singup")
    public String createNewUser(@RequestBody SingUpDTO dto) {
        return "User created";
    }

    @PostMapping("/singin")
    public String loginWithUserPassWord(@RequestBody SingInDTO dto) {
        return "Login success!!";
    }
    

}