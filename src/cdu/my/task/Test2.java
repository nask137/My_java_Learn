package cdu.my.task;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person z = new Person("zhangsna",(byte) 12);
        System.out.println(z.getAge());
        String s="Hello,world!";
        char c = s.charAt(2);
        System.out.println(c);
        char b=sc.next().charAt(0);
        System.out.println(b);
    }
}
