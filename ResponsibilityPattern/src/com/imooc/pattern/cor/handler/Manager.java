package com.imooc.pattern.cor.handler;

/**
 * Created by pp on 2017/4/9.
 */
public class Manager extends  PriceHandler {
    @Override
    public void processDiscount(float discont) {
        if(discont <= 0.40){
            System.out.format("%s批准了折扣:%.4f%n",this.getClass().getName(),discont);
        }else {
            selfPriceHandler.processDiscount(discont);
        }
    }
}
