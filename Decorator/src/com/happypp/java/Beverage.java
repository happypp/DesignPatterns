package com.happypp.java;

/**
 * @author Created by pengpeng on 2018/10/21
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
