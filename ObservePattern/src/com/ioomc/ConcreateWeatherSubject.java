package com.ioomc;

/**
 * Created by pp on 2017/4/6.
 */
public class ConcreateWeatherSubject extends WeatherSubject {

    //服务端的状态
    private String weatherSubjectState;

    public String getWeatherSubjectState() {
        return weatherSubjectState;
    }

    public void setWeatherSubjectState(String weatherSubjectState) {
        this.weatherSubjectState = weatherSubjectState;
        this.notifyObservers();
    }
}
