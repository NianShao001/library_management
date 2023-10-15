package com.example.springboot.service;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> list();

    Object page(UserPageRequest userPageRequest);

    void add(User user);

    User selectById(Integer id);

    void updateById(User user);

    void deleteById(Integer id);
}
