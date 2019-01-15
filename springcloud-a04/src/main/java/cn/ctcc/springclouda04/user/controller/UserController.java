package cn.ctcc.springclouda04.user.controller;

import cn.ctcc.bean.user.User;
import cn.ctcc.intface.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/2 14:16
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getUsers")
    public List<User> getUsers(){

        return userService.getUsers();
    }

}
