package contest4;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class XianCheng {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //多线程第一种实现方法  继承thread 重写run方法 并创建对象
//        Mythread t1 = new Mythread("飞机");
//        Mythread t2 = new Mythread("坦克");
        //没有给线程设置名字，会有初始名字 格式为Thread-序号（从零开始）
        //Thread 构造方法也可以给线程设置名字（重写父类构造方法）
//        System.out.println(t1.getName());
//        t1.start();
//        t2.start();
        //第二种实现方式 定义一个类实现 runnable接口
        //重写润方法创建的对象 创建thread对象
        //调用start
//        Mythread2 t = new Mythread2();
//        Thread thread = new Thread(t,"飞机");
//        Thread thread2 = new Thread(t,"坦克");
//        System.out.println(thread.getPriority());
//        System.out.println(Thread.currentThread().getPriority());
//        thread.setPriority(10);
//        thread2.setPriority(1);
//        thread.start();
//        thread2.start();
        //多线程第三中实现的方式
        //特点：获取多线程执行的结果
        //1.创建类实现Callable接口
        //2.重写call （有返回值）
        //创建实现Callable接口类的对象
        //创建Future实现类FutureTask的对象（管理多线程执行的结果）
        //创建thread的对象
//        Mythread3 m = new Mythread3();
//        FutureTask<Integer> ift = new FutureTask<Integer>(m);
//        Thread thread = new Thread(ift);
//        thread.start();
//        Integer integer = ift.get();
//        System.out.println(integer);
    }
}
