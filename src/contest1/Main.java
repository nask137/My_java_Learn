package contest1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  a = sc.next();
        Integer b;
        StringBuilder sb=new StringBuilder(a);
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < i; j++) {
            Integer in=new Integer(sb.substring(j,j+a.length()-i));
            if(in%3==0){ System.out.println(i);return ;}
            }
        }
        System.out.println(-1);




    }
}
