package com.ioomc.java;


/**
 * Created by pp on 2017/4/9.
 */
public class Client {
    public static void main(String[] args){
        //1：创建目标
        ConcreateWeatherSubject weatherSubject = new ConcreateWeatherSubject();
        //2：创建观察者
        ConcreateObserver girl = new ConcreateObserver();
        girl.setOberverName("我的女朋友");
        ConcreateObserver mm = new ConcreateObserver();
        mm.setOberverName("我的老妈");
        //3：注册观察者
        weatherSubject.addObserver(girl);
        weatherSubject.addObserver(mm);
        //4：发布天气
        weatherSubject.setWeatherContent("今天天气不错");
    }
}
