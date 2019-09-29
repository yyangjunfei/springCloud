package com.wanshan.consumer.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.wanshan.provider.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */

@RestController
public class UserController {

    @Reference  //@Reference来注入服务端爆入的接口
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return userService.getUser();
    }

}
