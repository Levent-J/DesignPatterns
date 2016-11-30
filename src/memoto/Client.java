package memoto;

/**
 * Created by levent_j on 16-11-30.
 */
public class Client {
    public static void main(String[] args){
        CallOfDuty game = new CallOfDuty();
        game.createPlayer("小刘子");
        game.play();
        game.play();
        game.play();
        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemote());
        game.quit();
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.readMemote());
        newGame.play();
    }
}
