package contest2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      myarraylist<Integer> list1=new myarraylist<>();
      list1.add(229);
      list1.add(55191);
      ListUtil.addAll(list1,7537,511,191,91,91);
      System.out.println(list1);
      myarraylist2 <Integer> list3=new myarraylist2();
      list3.add(56199);
      System.out.println(list3.toString());

    }
}
