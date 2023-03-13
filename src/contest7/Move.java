package contest7;

import java.util.Arrays;

public class Move {
    public static void main(String[] args) {
        int []a={0,3,7,0,42,0,1,0,1,5,0,6,8,4,2,0,2,6,9,45,2,0,0,1,5,6,2,0,2,5,10,65,5,1,0,2,5,1,0,2,12,0,0,4,5,20};
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(i==a.length-1)
                while(j<=i)
                    a[j++] = 0;

            if(a[i]!=0){
                a[j++]=a[i];

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
