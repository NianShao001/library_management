package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.controller.request.AdminPageRequest;
import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.Admin;
import com.example.springboot.entity.User;
import com.example.springboot.service.AdminService;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin//跨域
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/list")
    public Result list(){
        List<Admin> users = adminService.list();
        return Result.success(users);
    }
    @GetMapping("/page")
    public Result page(AdminPageRequest adminPageRequest){
        Object page = adminService.page(adminPageRequest);
        return Result.success(page);
    }
    //前端传给后端，json转换为user对象
    @PostMapping("/add")
    public Result add(@RequestBody Admin admin){
        adminService.add(admin);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        Admin admin = adminService.selectById(id);
        return Result.success(admin);
    }
    @PostMapping("/update")
    public Result updateById(@RequestBody Admin admin ){
        adminService.updateById(admin);
        return Result.success();
    }
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        adminService.deleteById(id);
        return Result.success();
    }

}
