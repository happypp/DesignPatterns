package com.pp.PizzaIngredient;

import com.pp.PizzaIngredient.domain.*;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();

}
