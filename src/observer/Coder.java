package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by levent_j on 16-11-25.
 */
public class Coder implements Observer{
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi "+name+",更新啦！详情："+arg);
    }

    @Override
    public String toString() {
        return "coder"+name;
    }
}
