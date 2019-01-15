package cn.ctcc.bean.user;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: zk
 * @Date: 2018/12/29 17:40
 * @Description:
 */
public class User implements Serializable{


    private static final long serialVersionUID = -269468980181224512L;


    private String id;

    private String name;

    private int age;

    private Date birthday;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
