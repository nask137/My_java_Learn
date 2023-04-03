package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a=NextDouble();
        double b=NextDouble();
        System.out.printf("Fee=%.1f",a*b);
    }
    public static double NextDouble() throws IOException {
        st.nextToken();
        return  st.nval;
    }
    static double area(double a){
        return 3.1416*Math.pow(a,2);
    }
   static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
}
