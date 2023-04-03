package cdu.my.task;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person z = new Person("zhangsna",(byte) 12,"男");
        MYdate mYdate = new MYdate(1, 1, 1);
        MYdate mYdate1 = new MYdate(1, 1, 1);
        System.out.println(mYdate1.equals(mYdate));

    }
}
