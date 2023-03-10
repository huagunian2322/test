package com.ioc.controller;

import com.ioc.servict.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
  private   UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public UserController() {}

    public UserService getUserService() {
        return userService;
    }
    @Autowired
    @Qualifier("s3")
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public double controller(double n1,double n2){
        return userService.sum(n1,n2);
    }
}
