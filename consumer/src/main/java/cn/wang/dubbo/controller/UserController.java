package cn.wang.dubbo.controller;

import cn.wang.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public String user(){
        return userService.getName();
    }
}
