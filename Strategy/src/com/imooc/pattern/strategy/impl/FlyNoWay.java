package com.imooc.pattern.strategy.impl;

import com.imooc.pattern.strategy.FlyingStrategy;

/**
 * Created by pp on 2017/4/26.
 */
public class FlyNoWay implements FlyingStrategy {
    @Override
    public void performFly() {
        System.out.println("我不会飞行");
    }
}
