package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        int n=nextInt();
        int []arr=new int[n+1];
        for (int i = 0; i <n; i++) {
            arr[i]=nextInt();
        }
        for (int i = 0; i <n ; i++) {

        }
    }
    public static int nextInt() throws IOException {

        in2.nextToken();
        return (int) in2.nval;
    }
    static StreamTokenizer in2 = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

}
