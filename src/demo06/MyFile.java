package demo06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFile {
    public static void main(String[] args) throws IOException {
//        //在当前模块下新建一个aaa文件夹
//        //在aaa中创建一个aaa.txt文件
//        File file = new File("aaa");
//        System.out.println(file.mkdirs());
//        File src = new File(file, "aaa.txt");
//        boolean b = src.createNewFile();
//        if (b) {
//            System.out.println("创建成功");
//
//        } else {
//            System.out.println("创建失败");
//
//        }

//        FileOutputStream fos =new FileOutputStream("aaa\\aaa.txt",true);
//        fos.write(99);
//        String s = "天行健，君子以自强不息";
//        byte[] bytes = s.getBytes();
//        fos.write(bytes);
//        String s1 = "\n\r";
//        byte[] bytes1 = s1.getBytes();
//        fos.write(bytes1);
//        fos.close();
        FileInputStream fis=new FileInputStream("aaa\\aaa.txt");
        char read = (char)fis.read();
        char read2 = (char)fis.read();
        System.out.println(read2);
        int b;
        while((b=fis.read())!=-1)
            System.out.print((char) b);
        fis.close();

    }
}
