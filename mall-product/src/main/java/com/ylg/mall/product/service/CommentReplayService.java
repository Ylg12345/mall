package com.ylg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylg.common.utils.PageUtils;
import com.ylg.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 11:54:54
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

