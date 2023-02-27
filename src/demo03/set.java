package demo03;

import java.util.Comparator;
import java.util.TreeSet;

public class set {

    public static void main(String[] args) {
        TreeSet<Girlfriend> ts=new TreeSet<Girlfriend>();
        Girlfriend g1 =new Girlfriend("慧慧",23,1.8);
        Girlfriend g2 =new Girlfriend("美美",18,1.72);
        Girlfriend g3 =new Girlfriend("乐乐",22,1.65);
        ts.add(g1);
        ts.add(g2);
        ts.add(g3);
        System.out.println(ts);
    }
}
