package com.xinlong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinlong.bean.Business;
import com.xinlong.dao.BusinessMapper;
import com.xinlong.service.BusinessService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business> implements BusinessService {

}
