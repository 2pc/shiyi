package com.baibei.shiyi.account.feign.client;

import com.baibei.shiyi.account.feign.base.shiyi.IAccountBase;
import com.baibei.shiyi.account.feign.base.shiyi.IPassCardExtractOrderBase;
import com.baibei.shiyi.account.feign.client.hystrix.AccountHystrix;
import com.baibei.shiyi.account.feign.client.hystrix.PassCardExtractOrderHystrix;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author: hyc
 * @date: 2019/5/24 1:51 PM
 * @description:
 */
@FeignClient(value = "shiyi-account", fallbackFactory = PassCardExtractOrderHystrix.class)
public interface PassCardExtractOrderFeign extends IPassCardExtractOrderBase {

}
