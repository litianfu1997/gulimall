package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author litianfu
 * @email 1035869369@qq.com
 * @date 2020-04-06 10:21:06
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
