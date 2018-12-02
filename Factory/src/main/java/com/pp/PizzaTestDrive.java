package com.pp;

import com.pp.Store.NYStylePizzaStore;
import com.pp.Store.PizzaStore;

/**
 * @author Created by pengpeng on 2018/12/2
 */
public class PizzaTestDrive {


    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");



    }
}
