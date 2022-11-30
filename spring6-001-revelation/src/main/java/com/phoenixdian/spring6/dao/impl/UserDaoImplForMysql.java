package com.phoenixdian.spring6.dao.impl;

import com.phoenixdian.spring6.dao.UserDao;

public class UserDaoImplForMysql implements UserDao {

    @Override
    public void deleteById() {
        System.out.println("mysql 数据库正在删除用户信息...");
    }
}
