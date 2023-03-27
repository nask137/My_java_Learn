package contest4;

public class XianCheng_Test {
    public static void main(String[] args) {
        Mythread m1 = new Mythread("张三");
        Mythread m2 = new Mythread("李四");
        Mythread m3 = new Mythread("王五");
        Mythread m4 = new Mythread("赵六");
        Mythread m5 = new Mythread("王楠");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
