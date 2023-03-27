package contest5;

import java.util.Stack;

public class Mystack {
    public static void main(String[] args) {
        Stack<Integer> in = new Stack<>();
        Integer push = in.push(1);
        System.out.println(push);
        System.out.println(in.empty());
in.add(5);
in.add(5);
while(!in.empty()){
    System.out.println(in.pop());
}
    }
}
