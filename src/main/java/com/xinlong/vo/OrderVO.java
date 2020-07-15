package com.xinlong.vo;


import com.xinlong.bean.Order;
import com.xinlong.bean.Product;
import lombok.Data;

import java.util.List;

/*
* 订单
*
* */
@Data
public class OrderVO {
    private Order order;
    /*当前订单所有商品的集合*/
    private List<Product> products;

}
