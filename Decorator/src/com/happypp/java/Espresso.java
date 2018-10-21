package com.happypp.java;

/**
 * @author Created by pengpeng on 2018/10/21
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
