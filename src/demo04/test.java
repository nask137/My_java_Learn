package demo04;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        set.add("lll啦啦啦！！！！！！1");
        set.add("学习java");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set);
        }
    }
}
