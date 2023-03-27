package contest6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPget {
    public static void main(String[] args) throws IOException {
        //1.手动绑定端口
        DatagramSocket ds = new DatagramSocket(10086);
        byte [] bytes=new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        int port = dp.getPort();
        System.out.println(address +"  "+port+" "+new String(data,0,length));
        ds.close();

    }
}
