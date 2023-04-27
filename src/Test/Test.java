package Test;


import  java.util.Scanner;

public  class  Test{
    public  static  void  main(String  []  args){
        Scanner  sc  =  new  Scanner(System.in);
        int  times  =  sc.nextInt();
        double  price  =  sc.nextDouble();

        double  pay2  =  0;

        MobilePhone  phone1=new  MobilePhone("13899999999",times,  price);
        try {
             pay2 = phone1.pay();
        } catch (PayException e) {
            System.out.println(e.getS());
        }

        System.out.println("Fee="+pay2);
    }
}

abstract  class  Phone{
    private  String  code;

    public  Phone(String  code){
        this.code  =  code;
    }

    public  abstract  void  display();

}

interface  PayAble{
    public  double  pay()throws  PayException;
}

class  MobilePhone  extends  Phone  implements  PayAble{
    private  int  time;
    private  double  price;

    public  MobilePhone(String  code,int  time,  double  price){
        super(code);
        this.time  =time;
        this.price  =  price;
    }


    public  double  pay()  throws  PayException{
        double  p;
        p=time*price;
        if(p<=0){
            throw  new  PayException("Fee  is  0");
        }
        return  p;
    }


    public  void  display(){
    }

}
class PayException extends Throwable {
    private String  s;
    public PayException(String s) {
        this.s = s;
    }
    public String getS() {
        return "PayException: "+s;
    }
}
