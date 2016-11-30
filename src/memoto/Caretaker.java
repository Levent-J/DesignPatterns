package memoto;

/**
 * Created by levent_j on 16-11-30.
 */
public class Caretaker {
    Memoto memoto;

    public void archive(Memoto memoto){
        System.out.println("----------正在存档----------");
        this.memoto = memoto;
    }

    public Memoto readMemote(){
        System.out.println("----------正在读档----------");
        return this.memoto;
    }
}
