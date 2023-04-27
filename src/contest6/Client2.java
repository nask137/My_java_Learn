package contest6;
import java.io.*;
import java.net.Socket;
public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.43.11",10);
        FileInputStream fis = new FileInputStream("Clientdir//Broforce.mp4");
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[]bytes=new byte[1024];
        int len;
        while((len=fis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        socket.close();
    }
}
