package com.ioomc.java;

import java.util.Observable;

/**
 * Created by pp on 2017/4/9.
 */
public class ConcreateWeatherSubject extends Observable {

    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.setChanged();
//        this.notifyObservers();
        this.notifyObservers(weatherContent);
    }
}
