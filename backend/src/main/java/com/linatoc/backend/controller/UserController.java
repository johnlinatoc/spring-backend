package com.linatoc.backend.controller;

import com.linatoc.backend.model.user.User;
import com.linatoc.backend.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//    controller > service > repo > db

@RestController
public class UserController {

    private ;

    public UserController()

    @PostMapping("/users")
    public String saveUserToService(){

        return "User saved successfully!";
    }
}