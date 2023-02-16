
package demo03;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int [][]a=new int [n][n];
            int [][]b=new int [n][n];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < i+1; j++) {
                    b[i][j]=sc.nextInt();
                }
            }
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j]=-1;
                }
            }
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.println(a[i][j]);
            }
        }*/
            System.out.println(getMax(n,b,a,0,0));
        }
        static int getMax(int n, int[][] b, int [][]a, int i, int j){
            if(a[i][j]!=-1){
                return a[i][j];
            }
            if(i==n-1)return b[i][j];
            else{
                a[i][j] =Math.max(getMax(n,b,a,i+1,j),getMax(n,b,a,i+1,j+1))+b[i][j];
                return a[i][j];
            }
        }
    }

