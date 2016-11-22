package factory;

/**
 * Created by levent_j on 16-11-22.
 */
public class AudiQ3 extends AudiCar{
    @Override
    public void drive() {
        System.out.println("Q3 is drive()");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3 is self()");
    }
}
