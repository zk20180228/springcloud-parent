package cn.ctcc.intface.user;

import cn.ctcc.bean.user.User;

import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/2 14:15
 * @Description:
 */
public interface UserService {

    List<User> getUsers();

}
