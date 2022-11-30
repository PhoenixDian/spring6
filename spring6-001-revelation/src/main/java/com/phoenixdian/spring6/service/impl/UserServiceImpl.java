package com.phoenixdian.spring6.service.impl;

import com.phoenixdian.spring6.dao.UserDao;
import com.phoenixdian.spring6.dao.impl.UserDaoImplForMysql;
import com.phoenixdian.spring6.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImplForMysql();


    @Override
    public void deleteUser() {
        userDao.deleteById();
    }

}
