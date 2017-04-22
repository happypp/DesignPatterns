package com.imooc.pattern.cor.handler;

/**
 * Created by pp on 2017/4/9.
 */
public class PirceHandlerFactory {

    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler director = new Director();
        PriceHandler manager = new Manager();
        PriceHandler vicePresident = new VicePresident();
        PriceHandler CEO = new CEO();
        sales.setSelfPriceHandler(vicePresident);
        vicePresident.setSelfPriceHandler(manager);
        manager.setSelfPriceHandler(director);
        director.setSelfPriceHandler(CEO);
        return sales;
    }
}
