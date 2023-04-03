package contest6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10);
        Socket socket = ss.accept();
        String name = UUID.randomUUID().toString().replace("-","");
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(Paths.get("Serverdir//"+name+".jpg")));
        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到了！！");
        bw.newLine();
        bw.flush();
        socket.close();

    }

}
