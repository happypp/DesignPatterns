package com.pp.domain;

import com.pp.PizzaIngredient.PizzaIngredientFactory;
import com.pp.PizzaIngredient.domain.Cheese;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class CheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing: " + name);
        cheese = pizzaIngredientFactory.createCheese();
//        clams = pizzaIngredientFactory.createClams();
        dough = pizzaIngredientFactory.createDough();
//        pepperoni = pizzaIngredientFactory.createPepperoni();
        veggies = pizzaIngredientFactory.createVeggies();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
