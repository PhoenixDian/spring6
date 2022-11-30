package com.phoenixdian.spring6.test;

import com.phoenixdian.spring6.bean.Clazz;
import com.phoenixdian.spring6.bean.SimpleClassType;
import com.phoenixdian.spring6.bean.Student;
import com.phoenixdian.spring6.bean.User;
import com.phoenixdian.spring6.jdbc.MyDataSource;
import com.phoenixdian.spring6.service.CustomerService;
import com.phoenixdian.spring6.service.OrderService;
import com.phoenixdian.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
    }

    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        CustomerService customerService2 = applicationContext.getBean("customerService2", CustomerService.class);
        CustomerService customerService3 = applicationContext.getBean("customerService3", CustomerService.class);
        customerService3.save();
        customerService2.save();
        customerService.save();
    }
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        OrderService orderService2 = applicationContext.getBean("orderService2", OrderService.class);

        orderService.generate();
        orderService2.generate();
    }

    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        User user = applicationContext.getBean("user", User.class);
        SimpleClassType simpleClassType = applicationContext.getBean("simpleClassType", SimpleClassType.class);
        System.out.println(user);
        System.out.println(simpleClassType);
    }

    @Test
    public void testMyDatasource(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testCascade(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cascade.xml");
        Student student = applicationContext.getBean("student", Student.class);
        Clazz clazz = applicationContext.getBean("clazz", Clazz.class);
        System.out.println(student);
        System.out.println(clazz);
    }
}
