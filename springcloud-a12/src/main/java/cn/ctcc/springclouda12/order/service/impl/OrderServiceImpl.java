package cn.ctcc.springclouda12.order.service.impl;

import cn.ctcc.bean.order.Order;
import cn.ctcc.intface.order.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: zk
 * @Date: 2019/1/3 17:36
 * @Description:
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    @Override
    public List<Order> getOrders() {

        Order order = new Order();
        order.setAddress("北京");
        order.setId(UUID.randomUUID().toString().replace("-",""));
        order.setUserId("12");
        order.setOrderTime(new Date());

        List<Order> orders = new ArrayList<>();
        orders.add(order);

        return orders;
    }
}
