package com.imooc.pattern.strategy;

/**
 * Created by pp on 2017/4/26.
 */
public class DuckTest {

    public static void main(String[] args){
        Duck duck = null;
//        duck = new MallardDuck();
//        duck = new RedheadDuck();
        duck = new RubberDuck();
        System.out.println("测试鸭子程序");
        System.out.println("-----------------------");
        duck.display();
        duck.quack();
        duck.flyStrategy();
        System.out.println("-----------------------");
        System.out.println("测试结束");


    }
}
