package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyWithWin;

/**
 * Created by pp on 2017/4/26.
 */
public class RedheadDuck extends Duck{

    public RedheadDuck() {
        super();
        /**
         * 将策略接口的实现注册到父类中
         */
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我是红头鸭子");
    }
}
