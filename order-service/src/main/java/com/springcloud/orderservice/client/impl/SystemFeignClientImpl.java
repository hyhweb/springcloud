package com.springcloud.orderservice.client.impl;

import com.springcloud.orderservice.client.SystemFeignClient;
import org.springframework.stereotype.Component;

@Component
public class SystemFeignClientImpl implements SystemFeignClient {
    @Override
    public String test() {
        return "test fallback";
    }
}
