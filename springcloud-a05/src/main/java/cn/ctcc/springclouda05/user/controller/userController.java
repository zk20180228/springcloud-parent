package cn.ctcc.springclouda05.user.controller;

import cn.ctcc.bean.user.User;
import cn.ctcc.springclouda05.user.feigninterface.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/2 16:59
 * @Description:
 */
@RequestMapping("user")
@RestController
public class userController {

    //这个Bean是在程序启动的时候注入的，编译器感知不到
    @Resource
    private UserService userService;


    @RequestMapping("/getUsers")
    List<User> getUsers(){

        System.out.println("----------------------------------feign----------------------------------------");
        return userService.getUsers();
    }
}
