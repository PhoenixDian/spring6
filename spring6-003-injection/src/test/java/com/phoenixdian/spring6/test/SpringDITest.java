package com.phoenixdian.spring6.test;

import com.phoenixdian.spring6.bean.*;
import com.phoenixdian.spring6.jdbc.MyDataSource;
import com.phoenixdian.spring6.jdbc.MyDataSource1;
import com.phoenixdian.spring6.jdbc.MyDataSource2;
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
    @Test
    public void testArrayDi(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");
        Boy boy = applicationContext.getBean("boy", Boy.class);
        System.out.println(boy);
    }

    @Test
    public void testCollection(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-collection.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
    @Test
    public void testSpringP(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dog = applicationContext.getBean("dog", Dog.class);
        System.out.println(dog);
    }
    @Test
    public void testSpringC(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-c.xml");
        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);
    }

    @Test
    public void testSpringUtil(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource2 dataSource2 = applicationContext.getBean("dataSource2", MyDataSource2.class);
        MyDataSource1 dataSource1 = applicationContext.getBean("dataSource1", MyDataSource1.class);
        System.out.println(dataSource1);
        System.out.println(dataSource2);

    }
    @Test
    public void testAutowiredByName(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService3 = applicationContext.getBean("orderService3", OrderService.class);
        orderService3.generate();
    }

    @Test
    public void testAutowiredByType(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowired.xml");
        CustomerService customerService4 = applicationContext.getBean("customerService4", CustomerService.class);
        customerService4.save();
    }

    @Test
    public void testProperties(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource myDataSource2 = applicationContext.getBean("myDataSource2", MyDataSource.class);
        System.out.println(myDataSource2);
    }
}
