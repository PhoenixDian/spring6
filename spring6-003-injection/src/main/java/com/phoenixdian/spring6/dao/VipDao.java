package com.phoenixdian.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipDao {
    private final static Logger logger=LoggerFactory.getLogger(VipDao.class);
    public void insert(){
        logger.info("Vip用户保存中...");
    }
}
