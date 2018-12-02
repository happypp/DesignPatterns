package com.pp.domain.NY;

import com.pp.domain.Pizza;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class NYCheesePizza extends Pizza{

    public NYCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }

//    @Override
//    public void prepare() {
//        log.info("芝士披萨 准备中～");
//    }
//
//    @Override
//    public void bake() {
//        log.info("芝士披萨 烘烤中～");
//    }

    @Override
    public void cut() {
        System.out.println("芝士披萨 切块中～");
    }

//    @Override
//    public void box() {
//        log.info("芝士披萨 装盒中～");
//    }
}
