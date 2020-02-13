package com.gundom.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService{

    @Override
    public void sayHi() {
        System.out.println("我是HelloService的接口实现方法");
    }
}
