package visitor;

/**
 * Created by levent_j on 16-12-1.
 */
public class CEOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师："+engineer.name+"的KPI是："+engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理："+manager.name+"的KPI是："+manager.kpi+"有"+manager.products+"个产品");
    }
}
