package contest7;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int []a={1,3,5,11,15,18,20};
        int []b={2,3,7,15,17,17,20,21,0,0,0,0,0,0,0};
        int n=a.length-1;
        int i=7;
        for (int m =b.length-1; m>0; m--) {
            if (a[n]<=b[i]||n==-1)b[m]=b[i--];
            else if (a[n]>=b[i]||i==-1) b[m]=a[n--];
        }
        System.out.println(Arrays.toString(b));
    }
}
