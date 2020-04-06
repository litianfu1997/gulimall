package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService service;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setName("魅族");

        service.save(brand);
        List<BrandEntity> list = service.list(new QueryWrapper<BrandEntity>());
        list.forEach((item)->{
            System.out.println(item);
        });
        System.out.println("保存成功");
    }

}
