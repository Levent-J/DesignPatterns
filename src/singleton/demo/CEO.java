package singleton.demo;

/**
 * Created by levent_j on 16-11-19.
 */
public class CEO extends Staff {
    private static final CEO mCEO = new CEO();
    private CEO(){}

    public static CEO getCEO(){
        return mCEO;
    }

    @Override
    public void work() {
        super.work();
    }
}
