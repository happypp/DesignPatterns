package com.imooc.pattern.cor.handler;

/**
 * Created by pp on 2017/4/9.
 */
public abstract class PriceHandler {

    protected PriceHandler selfPriceHandler;


    public abstract void processDiscount(float discont);


    public PriceHandler getSelfPriceHandler() {
        return selfPriceHandler;
    }

    public void setSelfPriceHandler(PriceHandler selfPriceHandler) {
        this.selfPriceHandler = selfPriceHandler;
    }

}
