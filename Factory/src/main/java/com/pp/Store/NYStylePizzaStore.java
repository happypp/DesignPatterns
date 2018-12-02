package com.pp.Store;

import com.pp.PizzaIngredient.NYPizzaIngredientFactory;
import com.pp.PizzaIngredient.PizzaIngredientFactory;
import com.pp.domain.CheesePizza;
import com.pp.domain.NY.NYCheesePizza;
import com.pp.domain.NY.NYGreekPizza;
import com.pp.domain.NY.NYPepperoniPizza;
import com.pp.domain.Pizza;
import com.pp.factory.SimplePizzaFactory;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
//            pizza = new NYCheesePizza();
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
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
