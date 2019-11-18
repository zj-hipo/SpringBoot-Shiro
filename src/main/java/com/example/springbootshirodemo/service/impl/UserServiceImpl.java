package com.example.springbootshirodemo.service.impl;

import com.example.springbootshirodemo.mapper.UserMapper;
import com.example.springbootshirodemo.pojo.User;
import com.example.springbootshirodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: springboot-shiro-demo
 * @description: 填写描述
 * @author: 张军
 * @create: 2019-11-18 12:35
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    public User findUserByName(String name) {

        return userMapper.findUserByName(name);
    }
}
