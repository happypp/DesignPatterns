package com.pp.Store;

import com.pp.domain.NY.NYCheesePizza;
import com.pp.domain.NY.NYGreekPizza;
import com.pp.domain.NY.NYPepperoniPizza;
import com.pp.domain.Pizza;
import com.pp.factory.SimplePizzaFactory;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class NYStylePizzatore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("greek")) {
            pizza = new NYGreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        }
        if (pizza == null) {
            throw new RuntimeException("order pizza is error: not pizza type");
        }
        return pizza;
    }
}
