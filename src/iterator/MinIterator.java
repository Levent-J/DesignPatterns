package iterator;

import java.util.*;

/**
 * Created by levent_j on 16-11-27.
 */
public class MinIterator implements Iterator{
    private List<Emplpyee> list;
    private int position;

    public MinIterator(List<Emplpyee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position>list.size()-1||list.get(position)==null);
    }

    @Override
    public Object next() {
        Emplpyee e = list.get(position);
        position++;
        return e;
    }
}
