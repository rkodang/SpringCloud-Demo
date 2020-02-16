package com.gundom.userservice.Controller;

import com.gundom.userservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/user")
    public String getUser(){
        System.out.println("进来了Controller01");
        return userService.getUser();
    }
    @ResponseBody
    @RequestMapping("/users")
    public String getUser(int id){
        System.out.println("进来了Controller02,参数是:"+id);

        String userById = userService.getUserById(id);
        System.out.println("返回了结果:"+userById);
        return userById;
    }

}
