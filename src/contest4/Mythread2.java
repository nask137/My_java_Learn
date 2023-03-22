package contest4;

public class Mythread2 implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i=0;i<50;i++) {
            System.out.println(name+"Hello World!");
        }
    }
}
