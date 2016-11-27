package observer;

/**
 * Created by levent_j on 16-11-25.
 */
public class Test {
    public static void main(String[] args){
        DevTechFrontier devTechFrontier = new DevTechFrontier();

        Coder coder1 = new Coder("\"李文靖\"");
        Coder coder2 = new Coder("刘庚");
        Coder coder3 = new Coder("刘一兰");

        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        devTechFrontier.postNewMessage("message1");
        devTechFrontier.postNewMessage("wooooooo");
        devTechFrontier.postNewMessage("sb");
    }
}
