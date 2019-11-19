package com.springcloud.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "system-service")
public interface SystemFeignClient {
    @GetMapping("/system/getUser")
    String test();

}
