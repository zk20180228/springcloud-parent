package cn.ctcc.springclouda10.user.service.fallback;

import cn.ctcc.bean.user.User;
import cn.ctcc.springclouda10.user.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: zk
 * @Date: 2019/1/3 14:19
 * @Description:
 */
@Component
public class FallbackUserService implements UserService {



    @Override
    public List<User> getUsers() {

        User user = new User();
        user.setAge(25);
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setName("springcloud-a10");
        user.setBirthday(new Date());
        List<User> users = new ArrayList<>();
        users.add(user);

        return users;
    }
}
