package com.imooc.proxy;

/**
 * Created by pp on 2017/4/15.
 */
public class Car2 extends Car {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶......  汽车行驶的时间：" + (endTime - startTime) + "毫秒");
    }
}
