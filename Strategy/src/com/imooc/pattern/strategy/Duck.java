package com.imooc.pattern.strategy;

/**
 * 鸭子抽象类:显示与鸣叫
 * Created by pp on 2017/4/26.
 */
public abstract class Duck {

    public void quack(){
        System.out.println("嘎嘎嘎！");
    }

    public abstract void display();

    /**
     * 策略模式要讲策略接口私有化到父类中
     */
    private FlyingStrategy flyingStrategy;

    public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
        this.flyingStrategy = flyingStrategy;
    }

    public void flyStrategy(){
        flyingStrategy.performFly();
    }
}
