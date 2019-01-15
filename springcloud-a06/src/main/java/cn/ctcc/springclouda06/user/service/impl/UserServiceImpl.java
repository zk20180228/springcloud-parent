package cn.ctcc.springclouda06.user.service.impl;

import cn.ctcc.bean.user.User;
import cn.ctcc.intface.user.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: zk
 * @Date: 2019/1/2 17:53
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackGetUsers")
    @Override
    public List<User> getUsers() {

        List<User> users=null;

        //模拟tomcat线程,默认200个线程
        for (int i=1;i<200;i++) {
            new Thread(){
                @Override
                public void run() {
                     restTemplate.getForObject("http://springcloud-eureka-hystrix-b/user/getUsers", List.class);
                }
            }.start();
        }

        users=restTemplate.getForObject("http://springcloud-eureka-hystrix-b/user/getUsers", List.class);

        return users;
    }


    public List<User> fallbackGetUsers(){

        User user = new User();
        user.setAge(20);
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setName("springcloud-a06");
        user.setBirthday(new Date());
        List<User> users = new ArrayList<>();
        users.add(user);

        return users;
    }

}
