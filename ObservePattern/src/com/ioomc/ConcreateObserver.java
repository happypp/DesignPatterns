package com.ioomc;

/**
 * Created by pp on 2017/4/6.
 */
public class ConcreateObserver implements Observer {
    //观察者的状态
    private String observerState;

    private String observerName;

    private String observerContent;

    @Override
    public void update(WeatherSubject subject) {
        observerState = ((ConcreateWeatherSubject)subject).getWeatherSubjectState();
        System.out.println(observerName + "收到了" + observerState + "," + observerContent);
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getObserverContent() {
        return observerContent;
    }

    public void setObserverContent(String observerContent) {
        this.observerContent = observerContent;
    }
}
