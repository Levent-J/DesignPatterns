package factory;

/**
 * Created by levent_j on 16-11-22.
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T create(Class<T> clz);
}
