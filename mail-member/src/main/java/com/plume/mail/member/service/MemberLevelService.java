package com.plume.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plume.common.utils.PageUtils;
import com.plume.mail.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 17:14:53
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

