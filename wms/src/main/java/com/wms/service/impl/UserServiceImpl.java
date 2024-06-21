package com.wms.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wms.entity.Data;
import com.wms.entity.User;
import com.wms.entity.UserData;
import com.wms.entity.UserPie;
import com.wms.mapper.UserMapper;
import com.wms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public IPage pageC(IPage<User> page) {
        return userMapper.pageC(page);
    }

    @Override
    public IPage pageCC(IPage<User> page, Wrapper wrapper) {
        return userMapper.pageCC(page,wrapper);
    }

    @Override
    public List<Data> getUser() {
        return userMapper.getUser();
    }

    @Override
    public UserPie getUserPie() {
        return userMapper.getUserPie();
    }

    @Override
    public UserPie getAdminPie() {
        return userMapper.getAdminPie();
    }

    @Override
    public UserPie getDeliveryPie() {
        return userMapper.getDeliveryPie();
    }

    @Override
    public UserData getPie() {
        return userMapper.getPie();
    }
}
