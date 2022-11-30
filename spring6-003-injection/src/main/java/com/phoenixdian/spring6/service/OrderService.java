package com.phoenixdian.spring6.service;

import com.phoenixdian.spring6.dao.OrderDao;

public class OrderService {
    private OrderDao orderDao;
    public void generate(){
        orderDao.insert();
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
