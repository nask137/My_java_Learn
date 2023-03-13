package contest7;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int []a={0,3,4,4,5,8,9,12,13};
        int []b={1,2,3,5,8,9,10,12,15,0,0,0,0,0,0,0,0,0};
        int n=a.length-1;
        int i=b.length-n-2;
        for (int m =b.length-1; m>0; m--) {
            if (a[n]<=b[i]||n==-1)b[m]=b[i--];
            else if (a[n]>=b[i]||i==-1) b[m]=a[n--];
        }if (a[0]<b[0])b[0]=a[0];
        System.out.println(Arrays.toString(b));
    }
}
