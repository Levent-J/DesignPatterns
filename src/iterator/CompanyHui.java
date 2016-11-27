package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levent_j on 16-11-27.
 */
public class CompanyHui implements Company{
    private Emplpyee[] array = new Emplpyee[3];

    public CompanyHui() {
        array[0] = new Emplpyee("小钱",23,"男","程序员");
        array[1] = new Emplpyee("小撒",34,"男","产品");
        array[2] = new Emplpyee("小未",55,"女","设计");
    }

    public Emplpyee[] getArray() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
