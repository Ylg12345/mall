package com.ylg.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylg.common.utils.PageUtils;
import com.ylg.common.utils.Query;

import com.ylg.mall.product.dao.CategoryDao;
import com.ylg.mall.product.entity.CategoryEntity;
import com.ylg.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listToTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //找出一级分类
        // 组成父子的树状结构, 给children设置子分类
        return entities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, entities)))
                .sorted(Comparator.comparing(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> entities) {
        return entities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, entities)))
                .sorted(Comparator.comparing(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuIds(List<Long> asList) {
        // TODO  1、检查当前删除的菜单，是否被别的地方引用
        baseMapper.deleteBatchIds(asList);
    }



}