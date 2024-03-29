package com.tr.springboot.encrypted.jpa;

import com.tr.springboot.encrypted.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserJpa extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}
