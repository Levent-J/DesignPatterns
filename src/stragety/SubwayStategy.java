package stragety;

/**
 * Created by levent_j on 16-11-24.
 */
public class SubwayStategy implements CalculateStrategy{
    @Override
    public int calculate(int km) {
        return km*2+4;
    }
}
