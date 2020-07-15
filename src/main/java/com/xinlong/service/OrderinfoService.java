package com.xinlong.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinlong.bean.Orderinfo;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
public interface OrderinfoService extends IService<Orderinfo> {
 void addOrderInfo(List<Orderinfo> orderinfos) throws Exception;
}
