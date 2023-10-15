package com.example.springboot.mapper;

import com.example.springboot.controller.request.AdminPageRequest;
import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.Admin;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<Admin>  list();

    List<Admin> listByCondition(AdminPageRequest adminPageRequest);

    void add(Admin admin);

    Admin selectById(Integer admin);

    void updateById(Admin admin);

    void deleteById(Integer id);
}
