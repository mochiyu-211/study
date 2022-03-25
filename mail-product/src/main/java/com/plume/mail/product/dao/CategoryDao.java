package com.plume.mail.product.dao;

import com.plume.mail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author plume
 * @email 908725898@qq.com
 * @date 2022-03-24 19:08:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
