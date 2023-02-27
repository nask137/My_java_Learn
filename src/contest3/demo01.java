package contest3;

import demo03.Girlfriend;

import java.util.Arrays;

public class demo01 {
   public static void main(String[] args) {
        method(( a,  b) -> a+b);
        Girlfriend g1 =new Girlfriend("慧慧",23,1.8);
        Girlfriend g2 =new Girlfriend("美美",18,1.72);
        Girlfriend g3 =new Girlfriend("乐乐",22,1.65);
        Girlfriend[]arr={g1,g2,g3};

       String s1="aaa";
       String s2="aaaaaaa";
       String s3="aa";
       String s4="a";
       String []arr2={s1,s2,s3,s4};
        Arrays.sort(arr2, (String o1, String o2)->
                 o1.length()-o2.length()

        );
       Arrays.sort(arr,(Girlfriend o1, Girlfriend o2)-> o1.getAge()- o2.getAge());
       for (String s : arr2) {
           System.out.println(s);
       }
       for (Girlfriend girlfriend : arr) {
           System.out.println(girlfriend);
       }
   }
    static void method(swim s){
        s.swimming("王楠","是帅哥！");
    }
}
