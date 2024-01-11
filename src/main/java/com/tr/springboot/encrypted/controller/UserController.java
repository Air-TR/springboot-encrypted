package com.tr.springboot.encrypted.controller;

import com.tr.springboot.encrypted.entity.User;
import com.tr.springboot.encrypted.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: TR
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @GetMapping("/user/all")
    public List<User> findAll() {
        return userService.findAll();
    }

}
