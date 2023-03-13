package contest7;
import java.util.Scanner;
public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) a[i]=sc.nextInt();
        for (int i = 0; i <n ; i++) a[(a[i] - 1) % n] += n;
        for (int i = 0; i <n ; i++) if(a[i]<=n&&a[i]>0) System.out.print(i+1+" ");
    }
}
