package com.ioomc.java;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by pp on 2017/4/9.
 */
public class ConcreateObserver implements Observer {

    private String oberverName;


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(oberverName + "收到了信息，目标推送过来的是" + arg);
        System.out.println(oberverName + "收到了信息，主动到目标里面去拉，拉的内容是" + ((ConcreateWeatherSubject)o).getWeatherContent());
    }

    public String getOberverName() {
        return oberverName;
    }

    public void setOberverName(String oberverName) {
        this.oberverName = oberverName;
    }
}
