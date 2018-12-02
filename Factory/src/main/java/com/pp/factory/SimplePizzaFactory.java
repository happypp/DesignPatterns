package com.pp.factory;

import com.pp.domain.CheesePizza;
import com.pp.domain.GreekPizza;
import com.pp.domain.PepperoniPizza;
import com.pp.domain.Pizza;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class SimplePizzaFactory {

    /**
     * 订购比萨饼
     * @return Pizza
     */
    public Pizza createOrder(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        if (pizza == null) {
            throw new RuntimeException("order pizza is error: not pizza type");
        }
        return pizza;
    }
}
