package com.ylg.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylg.common.utils.PageUtils;
import com.ylg.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 17:01:59
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

