package singleton.dcouble_check_lock;

/**
 * Created by levent_j on 16-11-19.
 */
public class Singleton {
    private static  Singleton singleton = null;
    private Singleton(){}
    public void doSth(){}
    public static Singleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
