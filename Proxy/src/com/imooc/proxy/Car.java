package com.imooc.proxy;

import java.util.Random;

/**
 * Created by pp on 2017/4/15.
 */
public class Car implements Moveable {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中......");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
