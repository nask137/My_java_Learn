package contest4;

import java.util.ArrayList;
import java.util.Collections;

public class Mythread2 extends Thread{
    ArrayList<Integer> list;
    public Mythread2(ArrayList<Integer> list){
        this.list=list;
    }
    @Override
    public void run() {
        while(true){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Mythread2.class){
                if(list.size()==0)break;
                else {
                    //抽奖
                    Collections.shuffle(list);
                    int prize =list.remove(0);
                    System.out.println(getName()+"抽奖箱又产生了一个"+prize+"元的大奖");



                }

            }

        }

    }
}
