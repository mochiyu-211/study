package com.plume.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.plume.common.utils.PageUtils;
import com.plume.mail.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-30 12:33:55
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

