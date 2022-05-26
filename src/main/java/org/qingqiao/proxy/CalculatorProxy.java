package org.qingqiao.proxy;

import org.qingqiao.jisuanqi.MyCalculator;
import org.qingqiao.jisuanqi.MyCalculatorImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    public static Object getInstance(final MyCalculatorImpl myCalculator){
        return Proxy.newProxyInstance(CalculatorProxy.class.getClassLoader(), myCalculator.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *	@param proxy 代理对象
             *	@param method 代理的方法
             *	@param args 方法的参数
             *	@return
             *	@throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+"方法开始执行啦...");
                Object invoke = method.invoke(myCalculator, args);
                System.out.println(invoke);
                System.out.println(method.getName()+"方法执行结束啦...");
                return invoke;
            }
        });
    }
}
