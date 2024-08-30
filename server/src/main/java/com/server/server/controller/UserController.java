package com.server.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.server.dto.request.UserRequestDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/")
    public String addUser(@RequestBody UserRequestDTO userDTO) {
        return "User added";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserRequestDTO userDTO) {
        
        
        return "User updated";
    }

    @PatchMapping("/{userId}")
    public String updateStatusUser(@PathVariable int userId, @RequestParam(required = false) boolean status) {
        return "User update status";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return "User deleted";
    }

    @GetMapping("/{userId}")
    public UserRequestDTO getUser(@PathVariable int userId) {
        return new UserRequestDTO("firstName", "lastName", "0101010", "a@test.com");
    }

    @GetMapping("/list")
    public List<UserRequestDTO> getAllUsers(@RequestParam String email, 
        @RequestParam(defaultValue = "0") int pageNo, 
        @RequestParam(defaultValue = "10") int pageSize) {
        List<UserRequestDTO> listUsers = new ArrayList<UserRequestDTO>();
        return listUsers;
    }
    
    
    
}
