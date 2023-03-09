package contest7;

import java.util.HashMap;
import java.util.Map;

public class Digui {
    static Map<Integer, Integer> a=new HashMap<Integer,Integer>();
    public static void main(String[] args) {
        int digui = digui(5);
        System.out.println(digui);
    }
    public static int digui(int n){
if(n==1)return 1;
if(n==2)return 2;
if(a.get(n)!=null)return a.get(n);
else {
    a.put(n, (digui(n-1)+digui(n-2)));
return digui(n-1)+digui(n-2);
}
    }
}
