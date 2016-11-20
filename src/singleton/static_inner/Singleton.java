package singleton.static_inner;

/**
 * Created by levent_j on 16-11-19.
 */
public class Singleton {
    private Singleton(){}
    public static Singleton getInstance(){
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static final Singleton sInstance = new Singleton();
    }
}
