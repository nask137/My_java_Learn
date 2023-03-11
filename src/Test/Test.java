package Test;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        String c;
        while (true) {
            String s = sc.next();
            if (s.equals("+") || s.equals("-") || s.equals("*")) {
                c = s;
                break;
            }
            a.add(Integer.valueOf(s));
        }
        int sqrt = (int) Math.sqrt(a.size());
        int [][]t=new int[sqrt][sqrt];
        int m=0;
        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j <sqrt ; j++) {
                t[i][j]=a.get(m++);
            }
        }
        int[][] b = new int[sqrt][sqrt];
        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {
                b[i][j] = sc.nextInt();

            }
        }
        switch (c) {
            case "+":{
                for (int i = 0; i < sqrt; i++) {
                    for (int j = 0; j < sqrt; j++) {
                        System.out.printf("%5d",b[i][j] + t[i][j] );
                    }
                    System.out.println();
                }
            }break;
            case "-":{
                for (int i = 0; i < sqrt; i++) {
                    for (int j = 0; j < sqrt; j++) {
                        System.out.printf("%5d",t[i][j] - b[i][j]);
                    }
                    System.out.println();
                }

            }break;
            case "*": {
                int[][] d=new int[sqrt][sqrt];
                for (int i = 0; i <sqrt ; i++) {
                    for (int j = 0; j <sqrt ; j++) {
                        d[j][i]=b[i][j];
                    }
                }
                for (int i = 0; i < sqrt; i++) {
                    for (int j = 0; j <sqrt ; j++) {
                        int sum=0;
                        for (int k = 0; k <sqrt ; k++) {
                            sum=sum+t[i][k]*d[j][k];
                        }
                        System.out.printf("%5d",sum);
                    }
                    System.out.println();
                }
            }break;
        }
    }

}
