package com.pp.domain;

import java.util.ArrayList;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;

    protected ArrayList<String> toppings = new ArrayList<>();

    /**
     * 准备
     */
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    };

    /**
     * 烘烤
     */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    };

    /**
     * 切
     */
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    };

    /**
     * 装盒
     */
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    };

    public String getName() {
        return name;
    }

}
