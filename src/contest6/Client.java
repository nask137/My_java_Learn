package contest6;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket = new Socket("192.168.193.102",10);
        //写出数据
        Scanner sc = new Scanner(System.in);
        OutputStream os=socket.getOutputStream();
        while (true) {
            System.out.println("请输入要发送的信息！！");
            String str=sc.nextLine();
            if("886".equals(str)){socket.shutdownOutput();break;}
            os.write(str.getBytes());
        }
        //接收数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b=0;
        while((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        //3.释放资源
        socket.close();

    }
}
