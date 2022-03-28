package com.plume.mail.member.feign;

import com.plume.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mail-coupon")
public interface couponFeignService {

    @RequestMapping("/coupon/categorybounds/member/list")
    public R memberCoupons();
}
