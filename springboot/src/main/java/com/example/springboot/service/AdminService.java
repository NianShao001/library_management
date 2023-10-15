package com.example.springboot.service;

import com.example.springboot.controller.request.AdminPageRequest;
import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.Admin;
import com.example.springboot.entity.User;

import java.util.List;

public interface AdminService {
    List<Admin> list();

    Object page(AdminPageRequest adminPageRequest);

    void add(Admin admin);

    Admin selectById(Integer id);

    void updateById(Admin admin);

    void deleteById(Integer id);
}
