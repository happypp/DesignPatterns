package com.imooc.jdkproxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * Created by pp on 2017/4/15.
 */
public class Test {

    public static void main(String[] args){
        Car car = new Car();
        Moveable mv = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(),
                car.getClass().getInterfaces(), new TimeHandler(car));
        mv = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(),
                car.getClass().getInterfaces(), new LogHandler(mv));
        mv.move();
    }
}
