package com.ylg.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylg.common.utils.PageUtils;
import com.ylg.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 14:24:12
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

