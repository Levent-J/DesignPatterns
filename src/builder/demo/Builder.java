package builder.demo;

/**
 * Created by levent_j on 16-11-20.
 */
public abstract class Builder {
    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String display);
    public abstract void buildOS();
    public abstract Computer create();
}
