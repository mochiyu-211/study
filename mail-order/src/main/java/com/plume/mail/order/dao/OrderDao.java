package com.plume.mail.order.dao;

import com.plume.mail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 17:32:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
