package com.springcloud.orderservice.client;

import com.springcloud.orderservice.client.impl.SystemFeignClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "system-service",fallback = SystemFeignClientImpl.class)
public interface SystemFeignClient {
    @GetMapping("/system/getUser")
    String test();

}
