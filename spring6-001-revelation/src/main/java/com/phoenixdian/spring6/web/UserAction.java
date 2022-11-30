package com.phoenixdian.spring6.web;

import com.phoenixdian.spring6.service.UserService;
import com.phoenixdian.spring6.service.impl.UserServiceImpl;

public class UserAction {

    private UserService userService=new UserServiceImpl();

    public void deleteRequest(){
        userService.deleteUser();
    }
}
