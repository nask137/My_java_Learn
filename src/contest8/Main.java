package contest8;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        DatagramSocket ds=new DatagramSocket(10086);
        while (true) {
            ds.receive(dp);
            byte[] data = dp.getData();
            int len=dp.getLength();
            System.out.println(new String(data,0,len));
        }
    }
}
