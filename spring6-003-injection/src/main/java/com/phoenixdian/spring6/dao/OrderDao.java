package com.phoenixdian.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderDao {
    private final static Logger logger= LoggerFactory.getLogger(OrderDao.class);
    public void insert(){
        logger.info("订单生成中");
    }
}
