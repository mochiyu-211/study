package com.plume.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plume.common.utils.PageUtils;
import com.plume.mail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-30 12:33:55
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

