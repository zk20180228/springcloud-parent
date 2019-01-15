package cn.ctcc.springclouda08.user.controller;

import cn.ctcc.bean.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: zk
 * @Date: 2019/1/2 17:53
 * @Description:
 */
@RequestMapping("user")
@RestController
public class UserController {


    @RequestMapping("getUsers")
    public List<User> getUsers() throws InterruptedException {

        List<User> users = new ArrayList<>();
        int i=1;
        while(i<=20){

            //Thread.sleep(3000);

            User user = new User();
            user.setId(UUID.randomUUID().toString().replace("-",""));
            user.setAge(i+15);
            user.setName("老"+i);
            user.setBirthday(new Date());
            users.add(user);
            i++;
        }

        System.out.println("========================================springcloud-eureka-hystrix-c===================================");
        return users;
    }


}
