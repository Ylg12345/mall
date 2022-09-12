package com.ylg.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylg.common.utils.PageUtils;
import com.ylg.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 17:01:59
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

