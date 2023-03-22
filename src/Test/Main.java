package Test;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int a=Integer.parseInt(s);
        System.out.println(s);
        bw.write(s);
        bw.flush();
    }
}
