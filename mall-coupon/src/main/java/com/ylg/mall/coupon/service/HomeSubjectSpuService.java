package com.ylg.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylg.common.utils.PageUtils;
import com.ylg.mall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 14:24:12
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

