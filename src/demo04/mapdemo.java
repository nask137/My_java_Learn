package demo04;

import java.util.HashMap;


public class mapdemo {
    public static void main(String[] args) {
        HashMap<Character, Integer> tm = new HashMap<>();
        tm.put('c',1);
        tm.put('b',1);
        tm.put('a',1);
        tm.put('f',1);
        tm.put('t',1);
        System.out.println(tm);
    }
}
