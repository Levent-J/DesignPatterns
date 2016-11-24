package stragety;

/**
 * Created by levent_j on 16-11-24.
 */
public class TaxiStrategy implements CalculateStrategy{
    @Override
    public int calculate(int km) {
        return 10+km*6;
    }
}
