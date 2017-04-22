package com.imooc.proxy;

/**
 * Created by pp on 2017/4/15.
 */
public class CarLogProxy implements Moveable {


    public CarLogProxy(Moveable m) {
        this.m = m;
    }

    private Moveable m;

    @Override
    public void move() {
        System.out.println("日志记录开始......");
        m.move();
        System.out.println("日志记录结束......");
    }
}
