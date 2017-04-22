package com.imooc.pattern.cor.handler.com.imooc.pattern.cor.Customer;

import com.imooc.pattern.cor.handler.PirceHandlerFactory;
import com.imooc.pattern.cor.handler.PriceHandler;

import java.util.Random;

/**
 * Created by pp on 2017/4/9.
 */
public class Customer {
    private PriceHandler priceHandler;

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

    public PriceHandler getPriceHandler() {
        return priceHandler;
    }

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PirceHandlerFactory.createPriceHandler());
        Random random = new Random();
        for(int i = 0;i < 100; i++){
            System.out.print(i + ":");
            customer.requestDiscount(random.nextFloat());
        }
    }
}
