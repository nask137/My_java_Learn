package iostream;
import org.apache.commons.io.FileUtils;
import java.io.*;

public class Buffered_Reader_and_writer {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new FileReader("aaa//aaa.txt"));
//        String s;
//        while((s=bf.readLine())!=null){
//            System.out.println(s);
//        }
//bf.close();
//        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa//b.txt"));
//            bw.write("你嘴角上扬的样子，百度搜索不到");
//            bw.newLine();
//            bw.close();
//        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw2.write(bf2.readLine());
        FileUtils.copyFile(new File("aaa//aaa.txt"), new File("aaa//b.txt"));
    }
}
