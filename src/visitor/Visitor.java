package visitor;

/**
 * Created by levent_j on 16-12-1.
 */
public interface Visitor {
    public void visit(Engineer engineer);
    public void visit(Manager manager);
}
