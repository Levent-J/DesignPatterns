package visitor;

/**
 * Created by levent_j on 16-12-1.
 */
public class Client {
    public static void main(String[] args){
        BusinessReport report = new BusinessReport();

        System.out.println("===========CEO视察工作===========");
        report.showReport(new CEOVisitor());
        System.out.println("===========CEO视察完毕===========");

        System.out.println();

        System.out.println("===========CTO视察工作===========");
        report.showReport(new CTOVisitor());
        System.out.println("===========CTO视察完毕===========");
    }
}
