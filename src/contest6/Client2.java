package contest6;
import java.io.*;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.43.11",10);
        BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(Paths.get("Clientdir//1894687523.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[]bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        socket.close();
    }
}
