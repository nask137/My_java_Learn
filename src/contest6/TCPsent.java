package contest6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPsent {
    public static void main(String[] args) throws IOException {
        //TPC发送数据
        //192.168.130.92是本机的ip地址。（这个地址并不是固定的  每次用前要在终端使用命令“ipconfig”来查看）
        //1.创建socket对象
        Socket socket = new Socket("192.168.130.92",10000);
        //2.从连接通道中发送流数据

        OutputStream os = socket.getOutputStream();

        //3.写数据
        os.write("你好啊".getBytes());
        socket.close();
    }
}
