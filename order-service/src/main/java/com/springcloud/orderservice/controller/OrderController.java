package com.springcloud.orderservice.controller;

import com.springcloud.orderservice.client.SystemFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private SystemFeignClient systemFeignClient;

    @GetMapping("test")
   public String Test(){
    return "test order";
   }
    @GetMapping("getUser")
    public String getUser(){
        return systemFeignClient.test();
    }

}
