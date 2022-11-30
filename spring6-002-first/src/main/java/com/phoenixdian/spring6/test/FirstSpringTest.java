package com.phoenixdian.spring6.test;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FirstSpringTest {

    @Test
    public void testBeginInitBean(){
        new ClassPathXmlApplicationContext("bean.xml");
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        logger.debug("一条debug消息");
        logger.error("error");
    }

    @Test
    public void testFirstSpringCode(){

        //第一步 获取spring容器
        //ApplicationContext 翻译为 用用上下文 其实就是spring容器
        //ClassPAthXmlApplicationContext 专门从类路径中加载spring配置文件的一个spring上下文对象
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","bean.xml");
        //IOC第层怎么实现的xml解析+工厂模式+反射机制
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","bean.xml","/xml/config.xml");
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

        Object userDaoBean = applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);

        Object vipBean = applicationContext.getBean("vipBean");
        System.out.println(vipBean);

        Object vipBean2 = applicationContext.getBean("vipBean2");
        System.out.println(vipBean2);

        //Object nowDate = applicationContext.getBean("nowDate");
        //System.out.println(nowDate);
        //Date nowDate = (Date) applicationContext.getBean("nowDate");
        Date nowDate =  applicationContext.getBean("nowDate",Date.class);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = simpleDateFormat.format(nowDate);
        System.out.println(format);
        //System.out.println(nowDate);

    }
}
