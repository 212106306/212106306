package com.wms.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wms.entity.Data;
import com.wms.entity.User;
import com.wms.entity.UserData;
import com.wms.entity.UserPie;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *

 */
public interface UserService extends IService<User> {

    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, Wrapper wrapper);

    List<Data> getUser();

    UserPie getUserPie();

    UserPie getAdminPie();

    UserPie getDeliveryPie();

    UserData getPie();
}
