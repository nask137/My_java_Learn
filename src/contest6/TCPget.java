package contest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPget {
    public static void main(String[] args) throws IOException {
        //TCP 接收数据
        //1.创建对象
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int b;
        while((b=br.read())!=-1){
            System.out.print((char) b);
        }
        accept.close();
        ss.close();
    }
}
