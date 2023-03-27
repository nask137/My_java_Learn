package contest4;

import java.util.Random;

public class Mythread extends Thread {
    //分享数据
    static int money=100;
    static int count=3;
    static final int  MIN=1;
    public Mythread() {
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run(){
       //同步代码块
      synchronized (Mythread.class){
          try {
              sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          if(count==0) System.out.println(getName()+"没有抢到红包！");
          else {
              int  prize=0;
              if(count==2||count==3){ Random r = new Random();
                  int bounds=money-(count-1)*MIN;
                  prize = r.nextInt(bounds);
                  if(prize<MIN)prize=MIN;
                  money=money-prize;
                  count--;
                  System.out.println(getName()+"抢到了"+prize+"元！");
              }
              else{
                  System.out.println(getName()+"抢到了"+money+"元!");
                  count--;
              }
          }

      }

    }

}
