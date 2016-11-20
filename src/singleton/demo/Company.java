package singleton.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by levent_j on 16-11-19.
 */
public class Company {
    private List<Staff> allStaffs = new ArrayList<Staff>();
    public void addStaff(Staff per){
        allStaffs.add(per);
    }

    public void showAllStaffs(){
        for (Staff staff : allStaffs) {
            System.out.println("staff is <"+staff+">");
        }
    }
}
