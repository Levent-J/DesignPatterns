package builder.demo;

/**
 * Created by levent_j on 16-11-20.
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOS();
    }
}
