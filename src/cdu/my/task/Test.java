package cdu.my.task;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三", (byte) 23);
        person.say2();
        Person.say();
    }
}
