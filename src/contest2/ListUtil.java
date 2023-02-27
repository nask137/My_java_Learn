package contest2;


public class ListUtil {
    private ListUtil(){}

    public static <E>void addAll(myarraylist<E> list, E ...e){
        for (E e1 : e) {
            list.add(e1);
        }

    }
}
