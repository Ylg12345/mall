package com.ylg.mall.product;

import com.ylg.mall.product.entity.BrandEntity;
import com.ylg.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("小米");
        brandService.save(brandEntity);

        System.out.println("保存成功");
    }

}
