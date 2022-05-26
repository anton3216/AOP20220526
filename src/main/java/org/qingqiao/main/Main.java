package org.qingqiao.main;

import org.qingqiao.config.JavaConfig;
import org.qingqiao.jisuanqi.MyCalculator;
import org.qingqiao.jisuanqi.MyCalculatorImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculator myCalculator = (MyCalculator) ctx.getBean("jisuanqi");

        myCalculator.add(3, 4);
        myCalculator.min(3, 4);
    }
}
