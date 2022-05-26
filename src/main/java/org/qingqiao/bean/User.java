package org.qingqiao.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class User implements ApplicationContextAware, BeanClassLoaderAware, BeanFactoryAware, BeanNameAware {
    private int id;
    private String name;
    // 保存感知的信息
    private String beanName;
    // 保存感知的信息
    private BeanFactory beanFactory;
    // 保存感知的信息
    private ApplicationContext ac;
    // 保存感知的信息
    private ClassLoader classLoader;



    public User() {
        System.out.println("User 被实例化");
    }

    /**
     * 自定义的初始化方法
     */
    public void start() {
        System.out.println("User 中自定义的初始化方法");
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", beanName=" + beanName + "]";
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println(">>> setBeanClassLoader");
        this.classLoader = classLoader;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(">>> setApplicationContext");
        this.ac = applicationContext;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(">>> setBeanName");
        this.beanName = name;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(">>> setBeanFactory");
        this.beanFactory = beanFactory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBeanName() {
        return beanName;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public ApplicationContext getAc() {
        return ac;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }
}
