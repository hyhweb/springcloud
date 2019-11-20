package com.springcloud.orderservice.controller;

import com.springcloud.orderservice.client.SystemFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private SystemFeignClient systemFeignClient;
    // 注入配置文件上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("test")
   public String Test(){
    return "test order";
   }
    @GetMapping("getUser")
    public String getUser(){
        return systemFeignClient.test();
    }
    @GetMapping("getYml")
    public String getYml(){

        return applicationContext.getEnvironment().getProperty("book.name");
    }
}
