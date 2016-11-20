package builder.demo;

/**
 * Created by levent_j on 16-11-20.
 */
public class Test {
    public static void main(String[] args){
        Builder builder = new MacbookBuilder();

        Director pcDirector = new Director(builder);

        pcDirector.construct("英特尔主板","Retina显示器");

        System.out.print("Computer : "+builder.create().toString());
    }
}
