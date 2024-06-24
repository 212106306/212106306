package com.warehouse.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.warehouse.entity.Record;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *

 */
public interface RecordService extends IService<Record> {
    IPage pageCC(IPage<Record> page, Wrapper wrapper);
}
