public class demo01 {
    public static void main(String[] args) {
        method(() -> System.out.println("正在游泳！"));

    }
    static void method(swim s){
        s.swimming();
    }
}
