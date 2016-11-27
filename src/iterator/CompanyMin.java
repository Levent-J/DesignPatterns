package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levent_j on 16-11-27.
 */
public class CompanyMin implements Company{
    private List<Emplpyee> list = new ArrayList<Emplpyee>();

    public CompanyMin() {
        list.add(new Emplpyee("小名",96,"男","程序员"));
        list.add(new Emplpyee("小王",12,"男","产品"));
        list.add(new Emplpyee("小章",25,"女","设计"));
        list.add(new Emplpyee("小李",33,"男","运维"));
        list.add(new Emplpyee("小江",45,"女","设计"));
        list.add(new Emplpyee("小马",44,"男","美工"));
        list.add(new Emplpyee("小胡",29,"男","测试"));
    }

    public List<Emplpyee> getList() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
