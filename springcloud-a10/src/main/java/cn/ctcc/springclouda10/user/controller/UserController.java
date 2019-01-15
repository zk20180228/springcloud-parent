package cn.ctcc.springclouda10.user.controller;

import cn.ctcc.bean.user.User;
import cn.ctcc.springclouda10.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/3 14:10
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    //这个bean是在程序启动时注入的，编译期，编译器感觉不到的
    @Resource
    private UserService userService;


    @RequestMapping("getUsers")
    public List<User> getUsers(){


        return userService.getUsers();
    }

}
