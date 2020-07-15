package com.xinlong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xinlong.bean.User;
import com.xinlong.dao.UserMapper;
import com.xinlong.service.UserService;

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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
