package cn.ctcc.springclouda12.order.controller;

import cn.ctcc.bean.order.Order;
import cn.ctcc.intface.order.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: zk
 * @Date: 2019/1/3 16:03
 * @Description:
 */
@RequestMapping("order")
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;


    @RequestMapping("getOrders")
    public List<Order> getOrders(){

        return  orderService.getOrders();
    }

}
