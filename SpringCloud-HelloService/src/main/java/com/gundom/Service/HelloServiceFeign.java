package com.gundom.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value ="SERVICE-USER")
public interface HelloServiceFeign {
    @RequestMapping("/user")
    public String getUser01();
    @RequestMapping("/users")
    public String getUser02(@RequestParam("id") int id);
}
