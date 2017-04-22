package com.imooc.proxy;

/**
 * Created by pp on 2017/4/15.
 */
public class Client {

    public static void main(String[] args){
//        Car car = new Car();
//        car.move();
//        //继承的方式实现
//        Moveable mv = new Car2();
//        mv.move();
        //聚合的方式实现
        Car car = new Car();
        CarTimeProxy ctp = new CarTimeProxy(car);
        CarLogProxy clp = new CarLogProxy(ctp);
        clp.move();
    }
}
