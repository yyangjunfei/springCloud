package com.example.eurekaapi.Entity;

/***
 * @author
 * @date
 * @version [v1.0]
 * @descriptionweb TODO
 */

public class MoUser {

    private  long id;
    private  String userName;
    private  String userPwd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
