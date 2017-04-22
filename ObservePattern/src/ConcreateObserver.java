/**
 * Created by pp on 2017/4/6.
 */
public class ConcreateObserver implements Observer {
    //观察者的状态
    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreateSubject)subject).getSubjectState();
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
