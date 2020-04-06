package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author litianfu
 * @email 1035869369@qq.com
 * @date 2020-04-06 10:47:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
