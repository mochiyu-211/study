package com.plume.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plume.common.utils.PageUtils;
import com.plume.mail.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-30 12:33:55
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

