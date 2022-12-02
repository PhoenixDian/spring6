package com.phoenixdian.spring6.test;

import com.phoenixdian.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeTest {


    @Test
    public void testBeanScope(){
        /**
         * 1.spring默认是如何管理这个bean的
         *  默认情况下 bean是单例的（singleton）
         *  在spring上下文初始化的时候创建
         *  每一次调用getBean()的时候都会返回那个单例对象
         * 2.当bean 的scope属性设置为prototype
         *  bean是多例的
         *  spring上下文初始化的时候，并不会初始化这些prototype的bean
         *  每一次调用getBean()的时候，实例化该bean对象
         *  prototype译为原型
         */
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean1 = applicationContext.getBean("springBean", SpringBean.class);
        SpringBean springBean2= applicationContext.getBean("springBean", SpringBean.class);
        SpringBean springBean3 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean1);
        System.out.println(springBean2);
        System.out.println(springBean3);
    }


    @Test
    public void testThreadScope(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");

        SpringBean bean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(bean);
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean springBean1 = applicationContext.getBean("springBean", SpringBean.class);
                System.out.println(springBean1);
                SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
                System.out.println(springBean2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean springBean1 = applicationContext.getBean("springBean", SpringBean.class);
                System.out.println(springBean1);
                SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
                System.out.println(springBean2);
            }
        }).start();
    }
}
