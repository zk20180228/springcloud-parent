package cn.ctcc.springclouda03.user.controller;

import cn.ctcc.bean.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: zk
 * @Date: 2018/12/29 17:42
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {



    @RequestMapping("getUsers")
    public List<User> getUsers(){

        List<User> users = new ArrayList<>();
        int i=1;
        while(i<=10){
            User user = new User();
            user.setId(UUID.randomUUID().toString().replace("-",""));
            user.setAge(i+15);
            user.setName("老"+i);
            user.setBirthday(new Date());
            users.add(user);
            i++;
        }

        System.out.println("========================================springcloud-a03===================================");
        return users;
    }


}
