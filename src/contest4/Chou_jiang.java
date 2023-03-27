package contest4;

import java.util.ArrayList;
import java.util.Collections;

public class Chou_jiang {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,200,150,30,158,301,20,450);
        //创建线程
        Mythread2 t=new Mythread2(list);
        Mythread2 t2=new Mythread2(list);
        t.setName("抽奖箱一");
        t2.setName("抽奖箱二");
        t.start();
        t2.start();
    }
}
