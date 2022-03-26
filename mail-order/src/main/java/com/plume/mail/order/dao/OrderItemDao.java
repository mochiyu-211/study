package com.plume.mail.order.dao;

import com.plume.mail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 17:32:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
