package com.warehouse.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.warehouse.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface StorageService extends IService<Storage> {
    IPage pageCC(IPage<Storage> page, Wrapper wrapper);
}
