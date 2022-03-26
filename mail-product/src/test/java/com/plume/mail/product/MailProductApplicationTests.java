package com.plume.mail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.plume.mail.product.entity.BrandEntity;
import com.plume.mail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MailProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {

		/*BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(2L);
		brandEntity.setName("apple");
		brandService.save(brandEntity);*/
		System.out.println(brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L)));
	}

}
