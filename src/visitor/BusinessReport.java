package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levent_j on 16-12-1.
 */
public class BusinessReport {
    List<Staff> staffs = new ArrayList<Staff>();

    public BusinessReport() {
        staffs.add(new Manager("王经理"));
        staffs.add(new Manager("张经理"));
        staffs.add(new Manager("刘经理"));
        staffs.add(new Engineer("工程师-Paul"));
        staffs.add(new Engineer("工程师-Mark"));
        staffs.add(new Engineer("工程师-David"));
    }

    public void showReport(Visitor visitor){
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
