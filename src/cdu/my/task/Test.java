package cdu.my.task;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("小白", 3, "白");
        Cat cat2 = new Cat("小花", 10, "花色");
        cats.add(cat1);
        cats.add(cat2);
        boolean flag=true;
        System.out.println("请输入猫的名字！！");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        for (Cat cat : cats) {
            if(cat.getName().equals(name)){ System.out.println(cat.toString());
             flag=false;
            }
        }
        if(flag)System.out.println("不存在此猫！！！");
    }
}
