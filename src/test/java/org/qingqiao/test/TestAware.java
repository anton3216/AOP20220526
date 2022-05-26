package org.qingqiao.test;

import org.junit.Test;
import org.qingqiao.bean.User;
import org.qingqiao.jisuanqi.MyCalculator;
import org.qingqiao.jisuanqi.MyCalculatorImpl;
import org.qingqiao.proxy.CalculatorProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAware {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ac.getBean(User.class);
        System.out.println("beanFactory:"+user.getBeanFactory());
        System.out.println("beanName:"+user.getBeanName());
        System.out.println("applicationContext:"+user.getAc());
        System.out.println("classLoader:"+user.getClassLoader());
        System.out.println(user);
    }

    @Test
    public void test2(){
        MyCalculatorImpl myCalculator = new MyCalculatorImpl();
        MyCalculator instance = (MyCalculator) CalculatorProxy.getInstance(myCalculator);
        instance.add(1,2);
    }
}
