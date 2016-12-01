package visitor;

/**
 * Created by levent_j on 16-12-1.
 */
public class CTOVisitor implements Visitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师："+engineer.name+"写了"+engineer.getCodeLines()+"行代码");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("劳资才不管你"+manager.name);
    }
}
