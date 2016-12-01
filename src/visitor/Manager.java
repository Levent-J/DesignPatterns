package visitor;

import java.util.Random;

/**
 * Created by levent_j on 16-12-1.
 */
public class Manager extends Staff{

    public int products;

    public Manager(String name) {
        super(name);
        this.products = new Random().nextInt(10);
    }

    public int getProducts(){
        return this.products;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
