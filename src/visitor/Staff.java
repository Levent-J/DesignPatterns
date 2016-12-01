package visitor;

import java.util.Random;

/**
 * Created by levent_j on 16-12-1.
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
