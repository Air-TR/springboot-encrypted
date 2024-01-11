package com.tr.springboot.encrypted.service.impl;

import com.tr.springboot.encrypted.entity.User;
import com.tr.springboot.encrypted.jpa.UserJpa;
import com.tr.springboot.encrypted.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: TR
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserJpa userJpa;

    @Override
    public User findById(Integer id) {
        return userJpa.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userJpa.findAll();
    }

}
