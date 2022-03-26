package com.plume.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plume.common.utils.PageUtils;
import com.plume.mail.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 17:14:53
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

