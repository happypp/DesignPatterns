package com.imooc.pattern.strategy;

import com.imooc.pattern.strategy.impl.FlyNoWay;

/**
 * Created by pp on 2017/4/26.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStrategy(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }

    /**
     * todo 叫声也可以写成策略模式，因为大黄鸭不能叫，但是又忘了重写父类的叫声方法，导致出现问题
     */
    @Override
    public void quack() {
        System.out.println("嘎~嘎~嘎~");
    }
}
