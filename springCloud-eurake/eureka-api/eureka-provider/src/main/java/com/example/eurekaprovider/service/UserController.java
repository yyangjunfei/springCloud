package com.example.eurekaprovider.service;
import com.example.eurekaapi.Entity.MoUser;
import com.example.eurekaapi.Interface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */

@RestController
public class UserController  implements UserInterface {

    @Resource
    private HttpServletRequest request;

    @Override
    public List<MoUser> getUsers() {
        List<MoUser> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MoUser moUser = new MoUser();
            moUser.setId(i);
            moUser.setUserName("Yang" + i);
            list.add(moUser);
        }
        return list;
    }


    @Override
    public String getMsg() {
        return "这里private 的端口:" +request.getServerPort();
    }
}
