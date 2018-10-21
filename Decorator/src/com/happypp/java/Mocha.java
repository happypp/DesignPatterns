package com.happypp.java;

/**
 * @author Created by pengpeng on 2018/10/21
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
