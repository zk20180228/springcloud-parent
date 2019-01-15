package cn.ctcc.springclouda04.user.service.impl;


import cn.ctcc.bean.user.User;
import cn.ctcc.intface.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/2 14:18
 * @Description:
 */
@Service("userService")
public class UserServiceImpl  implements UserService{

    @Resource
    private RestTemplate restTemplate;

    @Override
    public List<User> getUsers() {

        //springcloud-client-a 为应用名，同一个集群，一个应用名
        //List<User> userList = restTemplate.getForObject("http://springcloud-client-a/user/getUsers", List.class);

        User[] user = restTemplate.getForObject("http://springcloud-client-a/user/getUsers", User[].class);

        return Arrays.asList(user);
    }
}
