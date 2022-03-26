package com.plume.mail.coupon.dao;

import com.plume.mail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 16:09:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
