package builder.demo;

/**
 * Created by levent_j on 16-11-20.
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {
    }

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer [mBoard="+mBoard+",mDisplay="+mDisplay+",mOS="+mOS+"]";
    }
}
