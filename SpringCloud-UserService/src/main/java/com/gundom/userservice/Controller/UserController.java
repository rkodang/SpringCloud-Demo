package com.gundom.userservice.Controller;

import com.gundom.userservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/user")
    public String getUser(){
        return userService.getUser();
    }

}
