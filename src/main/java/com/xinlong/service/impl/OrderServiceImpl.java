package com.xinlong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinlong.bean.Order;
import com.xinlong.bean.Orderinfo;
import com.xinlong.bean.Product;
import com.xinlong.dao.OrderMapper;
import com.xinlong.dao.OrderinfoMapper;
import com.xinlong.service.OrderService;

import com.xinlong.service.OrderinfoService;
import com.xinlong.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 * 往订单表里填数据
 * 往订单详情里填数据
 * 往已售商品里填数据
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderinfoMapper orderinfoMapper;
    @Autowired
    OrderinfoService orderinfoService;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addOrder(OrderVO orderVO) {
        Order order = orderVO.getOrder();
        List<Product> products = orderVO.getProducts();
            orderMapper.insert(order);


            List<Orderinfo> orderinfos=new ArrayList<>();
        Long orderId = order.getOrderId();
        for (Product product : products) {
            Orderinfo orderinfo=new Orderinfo();
            orderinfo.setOrderId(orderId);
            orderinfo.setProId(product.getPid());
            orderinfos.add(orderinfo);
        }
        try {
            orderinfoService.addOrderInfo(orderinfos);
        } catch (Exception e) {

            e.printStackTrace();
        }


    }
}
