package demo03;

import java.util.ArrayList;
import java.util.Scanner;

public class integer {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            System.out.println("请输入一个整数");
            int n=sc.nextInt();
            if(n>=0&&n<=100)
            list.add(n);
            else System.out.println("输入整数错误！");
            int sum=judge(list);
            if(sum>200){ System.out.println("集合属总和大于200！");break;}


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    private static int  judge(ArrayList<Integer> list) {
        int  sum=0;
        for (int num : list) {
            sum = sum + num;
        }
        return  sum;
    }

}
