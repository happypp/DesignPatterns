package com.pp.PizzaIngredient;

import com.pp.PizzaIngredient.domain.*;
import com.pp.PizzaIngredient.domain.NY.*;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        NYVeggies[] nyVeggies = {};
        return nyVeggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Clams createClams() {
        return new NYClams();
    }
}
