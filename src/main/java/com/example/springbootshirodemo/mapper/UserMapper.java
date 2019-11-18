package com.example.springbootshirodemo.mapper;

import com.example.springbootshirodemo.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @program: springboot-shiro-demo
 * @description: 填写描述
 * @author: 张军
 * @create: 2019-11-18 12:20
 **/

public interface UserMapper {
    @Select("SELECT name,password FROM user WHERE name=#{vaule}")
    public User findUserByName(String name);
}
