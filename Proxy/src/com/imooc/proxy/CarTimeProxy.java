package com.imooc.proxy;

/**
 * Created by pp on 2017/4/15.
 */
public class CarTimeProxy implements Moveable {


    public CarTimeProxy(Moveable m) {
        this.m = m;
    }

    private Moveable m;

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶......  汽车行驶的时间：" + (endTime - startTime) + "毫秒");
    }
}
