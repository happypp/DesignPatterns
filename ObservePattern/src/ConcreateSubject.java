/**
 * Created by pp on 2017/4/6.
 */
public class ConcreateSubject extends Subject {

    //服务端的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
