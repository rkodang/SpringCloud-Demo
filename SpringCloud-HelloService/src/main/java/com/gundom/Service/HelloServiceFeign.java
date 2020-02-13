package com.gundom.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value ="SERVICE-USER")
public interface HelloServiceFeign {
    @RequestMapping("/user")
    public String getUser();
}
