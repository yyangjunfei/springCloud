package com.example.eurekaapi.Interface;
import com.example.eurekaapi.Entity.MoUser;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */
public interface UserInterface {

    @GetMapping("/users")
    List<MoUser> getUsers( );

    @GetMapping("/msg")
    String getMsg();
}
