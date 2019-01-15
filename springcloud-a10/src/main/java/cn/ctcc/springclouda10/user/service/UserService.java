package cn.ctcc.springclouda10.user.service;

import cn.ctcc.bean.user.User;
import cn.ctcc.springclouda10.user.service.fallback.FallbackUserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/3 14:12
 * @Description:
 */
@FeignClient(value = "springcloud-eureka-hystrix-c",fallback = FallbackUserService.class)
public interface UserService {



    @RequestMapping("/user/getUsers")
    List<User> getUsers();


}
