package com.example.eurekaconsumer.controller;
import com.example.eurekaapi.Entity.MoUser;
import com.example.eurekaconsumer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<MoUser> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/msg")
    public String getMsg() {
        return userService.getMsg();
    }

}
