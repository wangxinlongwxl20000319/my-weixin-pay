package com.xinlong.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xinlong.bean.Orderinfo;


import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangxinlong
 * @since 2020-07-10
 */
public interface OrderinfoMapper extends BaseMapper<Orderinfo> {
 void inserOrederInfos(List<Orderinfo> orderinfos);
}
