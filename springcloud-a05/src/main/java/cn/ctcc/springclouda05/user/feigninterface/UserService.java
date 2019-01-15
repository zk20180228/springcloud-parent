package cn.ctcc.springclouda05.user.feigninterface;

import cn.ctcc.bean.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/2 16:56
 * @Description:
 */
@FeignClient("springcloud-client-a")
public interface UserService {

    @RequestMapping("/user/getUsers")
    List<User> getUsers();


}
