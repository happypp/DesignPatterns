package com.ioomc;

/**
 * Created by pp on 2017/4/9.
 */
public class Client {
    public static void main(String[] args){
        //1：创建目标
        ConcreateWeatherSubject weatherSubject = new ConcreateWeatherSubject();
        //2：创建观察者
        ConcreateObserver girl = new ConcreateObserver();
        girl.setObserverName("我的女朋友");
        girl.setObserverContent("走小树林去");
        ConcreateObserver mm = new ConcreateObserver();
        mm.setObserverName("我的老妈");
        mm.setObserverContent("走购物去");
        //3：注册观察者
        weatherSubject.attach(girl);
        weatherSubject.attach(mm);
        //4：发布天气
        weatherSubject.setWeatherSubjectState("今天天气不错");
    }
}
