package memoto;

/**
 * Created by levent_j on 16-11-30.
 */
public class CallOfDuty {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mName;

    public void createPlayer(String name){
        mName = name;
    }

    public void play(){
        System.out.println("玩家"+mName);
        System.out.println("-------第"+mCheckPoint+"关-------");
        System.out.println("遇到敌人，打打打打打！");
        System.out.println("掉了10血");
        mLifeValue-=10;
        System.out.println("当前血量："+mLifeValue);
        System.out.println("过关了！");
        System.out.println("来到第"+ ++mCheckPoint +"关");
    }

    public void quit(){
        System.out.println("----------------------");
        System.out.println("当前关卡："+mCheckPoint);
        System.out.println("当前血量"+mLifeValue);
        System.out.println("----------------------");
    }

    public Memoto createMemote(){
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = this.mCheckPoint;
        memoto.mLifeValue = this.mLifeValue;
        memoto.mName = this.mName;
        return memoto;
    }

    public void restore(Memoto memoto){
        System.out.println("----------正在恢复----------");
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mName = memoto.mName;
        System.out.println("----------恢复完毕----------");
    }
}
