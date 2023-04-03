package contest6;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建对象绑定端口（10000）；
        ServerSocket ss = new ServerSocket(10);
        //2.等待用户连接
        Socket s=ss.accept();
        //3.读取数据
        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        int b=0;
        while((b=isr.read())!=-1){
            System.out.print((char)b);
        }
        //写出数据
        OutputStream os = s.getOutputStream();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        while (true) {
            System.out.println("请输入要发送的信息！！");
            String str=sc.nextLine();
            if("886".equals(str)){s.shutdownOutput(); break;}
            os.write(str.getBytes());
        }
        s.close();
        ss.close();
    }
}
