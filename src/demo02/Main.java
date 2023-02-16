package demo02;
    public class Main {
        public static void main(String[] args) {
            String regex ="(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
            System.out.println("22:21:20".matches(regex));
            String regex2 ="\\w+@\\w+(\\.\\w+){1,3}";
            System.out.println("wangnan@ww.11.qq".matches(regex2));
        }
    }

