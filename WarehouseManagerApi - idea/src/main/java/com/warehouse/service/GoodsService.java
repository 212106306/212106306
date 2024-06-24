package com.warehouse.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.warehouse.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author warehouse
 * @since 2023-01-06
 */
public interface GoodsService extends IService<Goods> {
    IPage pageCC(IPage<Goods> page, Wrapper wrapper);
}
