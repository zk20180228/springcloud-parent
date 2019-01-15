package cn.ctcc.intface.order;

import cn.ctcc.bean.order.Order;

import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/3 17:34
 * @Description:
 */
public interface OrderService {


    List<Order> getOrders();
}
