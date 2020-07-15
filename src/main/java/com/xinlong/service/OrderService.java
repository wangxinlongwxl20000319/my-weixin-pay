package com.xinlong.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinlong.bean.Order;

import com.xinlong.vo.OrderVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
public interface OrderService extends IService<Order> {
  void addOrder(OrderVO orderVO);
}
