package com.example.demo.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService = new UserService();
   

    @GetMapping
    private Boolean validationUser(){
       return  userService.validationUser();
    }

}
