package com.gundom.controller;

import com.gundom.Service.HelloService;
import com.gundom.Service.HelloServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
    @Autowired
    private HelloServiceFeign client;

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        helloService.sayHi();
        return "I 'm 9001";
    }
    @ResponseBody
    @RequestMapping("/hi")
    public String sayHi(){

        return client.getUser();
    }


}
