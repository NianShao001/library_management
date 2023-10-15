package com.example.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Admin {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String phone;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date create_time;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date update_time;
}
