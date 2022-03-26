package com.plume.mail.member.dao;

import com.plume.mail.member.entity.MemberReceiveAddressEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收货地址
 * 
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 17:14:53
 */
@Mapper
public interface MemberReceiveAddressDao extends BaseMapper<MemberReceiveAddressEntity> {
	
}
