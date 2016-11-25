package observer;

import java.util.Observable;

/**
 * Created by levent_j on 16-11-25.
 */
public class DevTechFrontier extends Observable {
    public void postNewMessage(String s){
        setChanged();
        notifyObservers(s);
    }
}
