package com.ylg.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylg.common.utils.PageUtils;
import com.ylg.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 14:24:12
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

