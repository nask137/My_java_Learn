package contest2;

import java.util.Arrays;

public class myarraylist <E>{
 Object [] o=new Object[10];
 int size=0;

    public   void add(E e ) {
  o[size]=e;size++;
    }
    public E get( int index){
        return (E) o[index];
    }
    public String toString(){
        return Arrays.toString(o);
    }
}


