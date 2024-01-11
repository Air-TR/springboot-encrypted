package com.tr.springboot.encrypted.service;

import com.tr.springboot.encrypted.entity.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();

}
