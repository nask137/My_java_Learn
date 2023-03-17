package iostream;

import java.io.*;
public class transform_stream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt",true));
        byte ch;
        while((ch= (byte) isr.read())!=-1){
           osw.write(ch);
        }
        osw.close();
        isr.close();
//        FileReader fr = new FileReader("aaa/aaa.txt");
//        System.out.println((char) fr.read());
    }
}
