package org.qingqiao.jisuanqi;

import org.qingqiao.aspect.MyAction;
import org.springframework.stereotype.Component;

@Component("jisuanqi")
public class MyCalculatorImpl implements MyCalculator {
    @MyAction
    public int add(int a, int b) {
        System.out.println(1/0);
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }
    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
