package com.example.springboot.mapper;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface UserMapper {
    // @Select("select * from user")
    List<User>  list();

    List<User> listByCondition(UserPageRequest userPageRequest);

    void add(User user);

    User selectById(Integer user);

    void updateById(User user);

    void deleteById(Integer id);
}
