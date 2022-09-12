package com.ylg.mall.product.dao;

import com.ylg.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Ylg
 * @email 2624966035@qq.com
 * @date 2022-09-12 11:54:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
