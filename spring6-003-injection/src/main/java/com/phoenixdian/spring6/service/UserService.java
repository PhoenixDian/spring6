package com.phoenixdian.spring6.service;

import com.phoenixdian.spring6.dao.UserDao;
import com.phoenixdian.spring6.dao.VipDao;

public class UserService {
    private UserDao userDao;

    private VipDao vipDao;

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.insert();
        vipDao.insert();
    }
}
