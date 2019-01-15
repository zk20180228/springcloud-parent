package cn.ctcc.bean.order;

import java.util.Date;

/**
 * @Auther: zk
 * @Date: 2019/1/3 16:04
 * @Description:
 */
public class Order {

    private String id;

    private String userId;

    private String address;

    private Date orderTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}
