package singleton;

import singleton.demo.CEO;
import singleton.demo.Company;
import singleton.demo.Staff;
import singleton.demo.VP;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        Staff ceo1 = CEO.getCEO();
        Staff ceo2 = CEO.getCEO();
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        company.addStaff(vp1);
        company.addStaff(vp2);
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);

        company.showAllStaffs();
    }
}
