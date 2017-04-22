package com.imooc.cglibproxy;

/**
 * Created by pp on 2017/4/15.
 */
public class Client {
    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();
    }
}
