package factory;

/**
 * Created by levent_j on 16-11-22.
 */
public class Client {
    public static void main(String[] args){
        AudiFactory factory = new AudiCarFactory();

        AudiCar audiQ3 = factory.create(AudiQ3.class);
        AudiCar audiQ5 = factory.create(AudiQ5.class);
        AudiCar audiQ7 = factory.create(AudiQ7.class);

        audiQ3.drive();
        audiQ3.selfNavigation();

        audiQ5.drive();
        audiQ5.selfNavigation();

        audiQ7.drive();
        audiQ7.selfNavigation();
    }
}
