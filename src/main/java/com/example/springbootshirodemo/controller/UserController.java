package com.example.springbootshirodemo.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @program: springboot-shiro-demo
 * @description: 填写描述
 * @author: 张军
 * @create: 2019-11-15 22:19
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "TEST!!!!";
    }
    /*
    * 首页
    * */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    /*
    * 添加页面
    * */
    @RequestMapping("/add")
    public String add(){
        return "/end/add";
    }
   /*
   * 删除页面
   * */
    @RequestMapping("/delete")
    public String delete(){
        return "/end/delete";
    }
    /*
    * 登录页面
    * */
    @RequestMapping("/toLogin")
    public String tologin(){
        return "/end/login";
    }

    @RequestMapping("/login")
    public String login(String name, String password, Model model){
        /*
        * 编写shiro的认证操作
        * */
        //获取Subject
        Subject subject=SecurityUtils.getSubject();
        //封装用户数据
        UsernamePasswordToken token=new UsernamePasswordToken(name,password);
        //执行登录方法
        try {
            //登录的校验会交给UserRealm
            subject.login(token);
            //没有异常代表登录成功
            //登录成功跳转到添加页面,重定向的时候msg消息传递不过去
            return "redirect:/user/add";
        } catch (UnknownAccountException e) {
            //有任何异常代表登录失败
            //UnknownAccountException代表用户名不存在
            model.addAttribute("msg","用户名不存在");
            return "/end/login";
        }catch (IncorrectCredentialsException e){
            //IncorrectCredentialsException代表密码错误
            model.addAttribute("msg","密码错误");
            return "/end/login";

        }
    }
}
