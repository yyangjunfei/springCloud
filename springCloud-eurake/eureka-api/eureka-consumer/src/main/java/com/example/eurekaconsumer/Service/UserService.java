package com.example.eurekaconsumer.Service;
import com.example.eurekaapi.Interface.UserInterface;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */


@FeignClient(value = "Server-Provider")
@Service
public interface UserService extends UserInterface {

}
