package com.example.springboot.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.example.springboot.controller.request.AdminPageRequest;
import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.Admin;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.AdminMapper;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.AdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> list() {
        return adminMapper.list();
    }

    @Override
    public Object page(AdminPageRequest adminPageRequest) {
        //pagehelp插件，传入页码和大小
        PageHelper.startPage(adminPageRequest.getPageNum(),adminPageRequest.getPageSize());
        List<Admin> users = adminMapper.listByCondition(adminPageRequest);

        return new PageInfo<>(users);
    }

    @Override
    public void add(Admin admin) {
        Date date = new Date();
        admin.setUsername(DateUtil.format(date,"yyyyMMdd") + Math.abs(IdUtil.fastSimpleUUID().hashCode()) );
        adminMapper.add(admin);
    }



    @Override
    public Admin selectById(Integer id) {
        return adminMapper.selectById(id);
    }

    @Override
    public void updateById(Admin admin) {
        admin.setUpdate_time(new Date());
        adminMapper.updateById(admin);
    }

    @Override
    public void deleteById(Integer id) {
        adminMapper.deleteById(id);
    }


}
