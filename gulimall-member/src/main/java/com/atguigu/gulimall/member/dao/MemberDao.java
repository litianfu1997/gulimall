package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author litianfu
 * @email 1035869369@qq.com
 * @date 2020-04-06 10:34:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
