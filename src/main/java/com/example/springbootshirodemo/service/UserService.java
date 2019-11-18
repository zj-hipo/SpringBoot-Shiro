package com.example.springbootshirodemo.service;

import com.example.springbootshirodemo.pojo.User;

/**
 * @program: springboot-shiro-demo
 * @description: 填写描述
 * @author: 张军
 * @create: 2019-11-18 12:33
 **/

public interface UserService {
    public User findUserByName(String name);
}
