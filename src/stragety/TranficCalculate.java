package stragety;

/**
 * Created by levent_j on 16-11-24.
 */
public class TranficCalculate {

    public static void main(String[] args){
        TranficCalculate tranficCalculate = new TranficCalculate();

        tranficCalculate.setStrategy(new BusStrategy());
        System.out.println("公交车："+tranficCalculate.calculate(10));

        tranficCalculate.setStrategy(new SubwayStategy());
        System.out.println("地铁："+tranficCalculate.calculate(10));

        tranficCalculate.setStrategy(new TaxiStrategy());
        System.out.println("出租车："+tranficCalculate.calculate(10));
    }

    CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int calculate(int km){
        return this.strategy.calculate(km);
    }
}
