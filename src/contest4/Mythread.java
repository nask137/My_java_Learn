package contest4;

public class Mythread extends Thread {
   @Override
    public void run(){
       for (int i = 0; i < 100; i++) {
           System.out.println(this.getName()+"hh");
       }

   }

}
