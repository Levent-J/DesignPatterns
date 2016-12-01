package visitor;

import java.util.Random;

/**
 * Created by levent_j on 16-12-1.
 */
public class Engineer extends Staff{

    public Engineer(String name) {
        super(name);
    }

    public int getCodeLines(){
        return new Random().nextInt(1000*100);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
