package Test;
import cn.hutool.core.io.file.FileCopier;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        File file = new File("Clientdir//Broforce.mp4");
        File file2 = new File("Serverdir//Broforce.mp4");
        FileCopier fc = new FileCopier(file, file2);
        fc.copy();
    }
}
