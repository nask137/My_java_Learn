package demo05;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        Grilfrend grilfrend = new Grilfrend();
        System.out.println("请输入女朋友的名字");
        String s = sc.nextLine();
        try {
            grilfrend.setName(s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("请输入女朋友奈年龄");
        String age = sc.nextLine();
        grilfrend.setAge(Byte.parseByte(age));
        System.out.println(grilfrend);
    }

}
