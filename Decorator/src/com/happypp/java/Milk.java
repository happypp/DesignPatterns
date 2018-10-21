package com.happypp.java;

/**
 * @author Created by pengpeng on 2018/10/21
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
