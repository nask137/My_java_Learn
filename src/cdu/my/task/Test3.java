package cdu.my.task;

import java.sql.Date;

public class Test3 {
    public static void main(String[] args) {
        int it =65;
        float fl=65.0f;
        System.out.println(it==fl);
        char ch1='A';
        char ch2=12;
        System.out.println(it == ch1);
        System.out.println(12 == ch2);
        String hello = "Hello";
        String hello2 = "Hello";
        System.out.println(hello2 == hello);
        System.out.println(hello2 .equals(hello));
   //     System.out.println("Hello" == new Date());
    }
}
