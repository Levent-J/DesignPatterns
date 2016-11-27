package iterator;

/**
 * Created by levent_j on 16-11-27.
 */
public class Emplpyee {
    private String name;
    private int age;
    private String sex;
    private String position;

    public Emplpyee(String name, int age, String sex, String position) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{"+
                "name='"+name+'\''+
                ",age="+age+
                ",sex="+sex+
                ",position='"+position+'\''+
                '}';
    }
}
