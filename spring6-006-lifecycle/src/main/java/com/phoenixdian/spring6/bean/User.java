package com.phoenixdian.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Bean的生命周期按粗略的5步的话
 * 1.实例化bean（调用无参构造）
 * 2.给bean属性赋值（调用set方法）
 * 3.调用初始化方法init（）
 * 4.使用bean
 * 5.销毁bean destroy
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean,DisposableBean {
    private String name;

    public void setName(String name) {
        System.out.println("2.给属性赋值");
        this.name = name;
    }

    public User() {
        System.out.println("1.无参构造实例化");
    }
    public void initMethod(){
        System.out.println("3.初始化init");
    }
    public void destroyMethod(){
        System.out.println("5.销毁bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("类加载器"+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("bean名字"+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("后处理器执行before结束");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁之前");
    }
}
