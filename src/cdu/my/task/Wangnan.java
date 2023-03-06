package cdu.my.task;

public class Wangnan {
String name ="wangnan";
byte age=10;
public void eat() {
    System.out.println("我吃我吃，我吃吃吃！！！");
}

    public static void main(String[] args) {
        Wangnan wangnan = new Wangnan();
        wangnan.eat();
        System.out.println("名字："+wangnan.name+",年龄："+wangnan.age);

    }
}
