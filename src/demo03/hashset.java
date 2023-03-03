package demo03;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Girlfriend g1 =new Girlfriend("慧慧",23,1.8);
        Girlfriend g2 =new Girlfriend("美美",18,1.72);
        Girlfriend g3 =new Girlfriend("乐乐",22,1.65);
        Set<Girlfriend> s=new HashSet<Girlfriend>();
        s.add(g1);
        s.add(g2);
        s.add(g3);
        for (Girlfriend next : s) {
            System.out.println(next);

        }


    }



}
