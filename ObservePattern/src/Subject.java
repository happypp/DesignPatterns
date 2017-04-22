import java.util.ArrayList;
import java.util.List;

/**
 * Created by pp on 2017/4/6.
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();


    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    protected void notifyObservers(){
        for(Observer observer : observerList){
            observer.update(this);
        }
    }


}
