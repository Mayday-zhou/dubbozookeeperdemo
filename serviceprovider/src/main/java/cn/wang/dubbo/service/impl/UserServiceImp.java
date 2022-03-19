package cn.wang.dubbo.service.impl;

import cn.wang.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImp implements UserService {
    public String getName() {
        return "hello";
    }
}
