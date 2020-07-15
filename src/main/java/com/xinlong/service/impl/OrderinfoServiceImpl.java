package com.xinlong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinlong.bean.Orderinfo;
import com.xinlong.dao.OrderinfoMapper;
import com.xinlong.service.OrderinfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@Service
public class OrderinfoServiceImpl extends ServiceImpl<OrderinfoMapper, Orderinfo> implements OrderinfoService {
    @Autowired
    OrderinfoMapper orderinfoMapper;
    @Override
    public void addOrderInfo(List<Orderinfo> orderinfos) throws Exception {
        if(orderinfos.isEmpty()||orderinfos == null){
            throw new NullPointerException();
        }
     orderinfoMapper.inserOrederInfos(orderinfos);
    }
}
