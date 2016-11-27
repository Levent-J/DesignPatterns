package iterator;

import java.util.List;

/**
 * Created by levent_j on 16-11-27.
 */
public class HuiIterator implements Iterator{
    private Emplpyee[] array;
    private int position;

    public HuiIterator(Emplpyee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position>array.length-1||array[position]==null);
    }

    @Override
    public Object next() {
        Emplpyee e = array[position];
        position++;
        return e;
    }
}
