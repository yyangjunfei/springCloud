package com.wanshan.provider.service.Impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.wanshan.provider.service.UserService;


/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */
@Service
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    public String getUser() {
        return "你好，DUBBO";
    }
}
