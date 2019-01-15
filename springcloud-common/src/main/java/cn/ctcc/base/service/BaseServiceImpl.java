package cn.ctcc.base.service;

import cn.ctcc.bean.user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: zk
 * @Date: 2019/1/3 11:32
 * @Description:
 */
public class BaseServiceImpl  {


    public List<User> hystrixFallbackMethod(){

        User user = new User();
        user.setAge(24);
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setName("白小白");
        user.setBirthday(new Date());
        List<User> users = new ArrayList<>();
        users.add(user);

        return users;

    }

}
