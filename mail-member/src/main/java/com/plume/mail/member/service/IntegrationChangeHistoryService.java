package com.plume.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plume.common.utils.PageUtils;
import com.plume.mail.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-26 17:14:53
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

