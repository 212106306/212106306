package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.Data;
import com.wms.entity.User;
import com.wms.entity.UserData;
import com.wms.entity.UserPie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user")
    IPage pageC(IPage<User> page);

    @Select("select * from user ${ew.customSqlSegment}")
    IPage pageCC(IPage<User> page, @Param(Constants.WRAPPER) Wrapper wrapper);

    @Select("")
    List<Data> getUser();

    UserPie getUserPie();

    UserPie getAdminPie();

    UserPie getDeliveryPie();

    UserData getPie();
}
