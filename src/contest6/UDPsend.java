package contest6;

import java.io.IOException;
import java.net.*;

public class UDPsend {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象
        //2可以绑定端口 以后通过这个端口来发送信息
        //如果没有写参数 所有可用端口 随机使用
        DatagramSocket ds = new DatagramSocket();
        //2.打包数据
        String str="函哥好帅";
        byte[] bytes = str.getBytes();
        //192.168.130.92是本机的ip地址
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port=10086;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        //发送数据
        ds.send(dp);
        //释放
        ds.close();
    }
}
