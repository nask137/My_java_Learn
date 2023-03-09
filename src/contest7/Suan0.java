package contest7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Suan0 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> b = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int[] c = new int[4];
        for (int i = 0; i < 4; i++) {
            c[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        boolean flag = true;
        for (int i = 0; i < c.length; i++) {
            int temp = d - c[i];
            b.put(i, temp);
            for (int j = 0; j < i; j++) {
                if (c[i] == b.get(j)) {
                    System.out.print(i + " ");
                    System.out.print(j);
                    flag = false;
                    break;
                }
            }
        }
        if (flag) System.out.println("false");


    }
    }

