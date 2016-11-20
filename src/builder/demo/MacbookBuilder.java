package builder.demo;

/**
 * Created by levent_j on 16-11-20.
 */
public class MacbookBuilder extends Builder{

    private Computer computer = new MacBook();

    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        computer.setOS();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
