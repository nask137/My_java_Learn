package demo01;

import cn.hutool.core.io.file.FileCopier;
import cn.hutool.core.io.file.FileReader;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File test = new File("aaa//aaa.txt");

        FileReader fr = new FileReader(test);
        System.out.println(fr.readString());
    }
}
