package com.gundom.userservice.Service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "我是UserService接口的实现方法";
    }
}
