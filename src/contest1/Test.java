package contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Friends 王楠 = new Friends("王楠", 19);
        Friends 李函 = new Friends("李函", 20);
        ArrayList<Friends> f = new ArrayList<>();
        Collections.addAll(f,王楠,李函);
        Collections.sort(f,( o1,  o2)->   o2.getAge()-o1.getAge()  );
    }
}
