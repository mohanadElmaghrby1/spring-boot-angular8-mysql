package com.mohannad.springmysql.controller;

import com.mohannad.springmysql.model.User;
import com.mohannad.springmysql.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by mohannad  on 26/10/19
 */
@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
