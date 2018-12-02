package com.pp.Store;

import com.pp.domain.Pizza;
import com.pp.factory.SimplePizzaFactory;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public abstract class PizzaStore {

//    private SimplePizzaFactory simplePizzaFactory;
//
//    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
//        this.simplePizzaFactory = simplePizzaFactory;
//    }

    public Pizza orderPizza(String type) {
//        Pizza pizza = simplePizzaFactory.createOrder(type);
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
