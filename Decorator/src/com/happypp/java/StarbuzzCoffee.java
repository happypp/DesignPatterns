package com.happypp.java;

/**
 * @author Created by pengpeng on 2018/10/21
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }

}
