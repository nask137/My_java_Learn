package contest6;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GanServe {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("阻塞中~~");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = accept.getOutputStream();
        byte[] a=new byte[1024];
        int length=0;
        FileOutputStream fileInputStream = new FileOutputStream("D:\\IDEA-workspace\\My_java_Learn.2\\Serverdir\\test1.mp4");
        while ((length=inputStream.read(a))!=-1){
            fileInputStream.write(a,0,length);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        inputStream.close();outputStream.close();accept.close();
        System.out.println("服务端退出~");
    }
}

