package cn.ctcc.springclouda09.user.service.impl;

import cn.ctcc.base.service.BaseServiceImpl;
import cn.ctcc.bean.user.User;
import cn.ctcc.intface.user.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/2 17:53
 * @Description:
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService {


    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixFallbackMethod")
    @Override
    public List<User> getUsers() {

        List<User> users = restTemplate.getForObject("http://springcloud-eureka-hystrix-c/user/getUsers", List.class);
        return users;
    }






}
