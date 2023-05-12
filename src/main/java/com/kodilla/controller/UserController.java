package com.kodilla.controller;

import com.kodilla.bytebuddy.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/create")
    public String createUser() {
        User user = new User();
        return user.getName();
    }
}
