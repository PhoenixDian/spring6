package com.phoenixdian.spring6.test;

import com.phoenixdian.spring6.bean.Student;
import com.phoenixdian.spring6.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifecycleTest {
    @Test
    public void testFive(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println("4.使用bean___"+user);
        context.close();
    }

    @Test
    public void testSeven(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("user", User.class);
        System.out.println("4.使用bean___"+user);
        context.close();
    }

    @Test
    public void testRegister(){
        Student student = new Student();
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        defaultListableBeanFactory.registerSingleton("student",student);
        Student student1 = defaultListableBeanFactory.getBean("student", Student.class);
        System.out.println(student1==student);
    }
}
