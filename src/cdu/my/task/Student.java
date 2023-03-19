package cdu.my.task;

public class Student {
    private String name ;
    private byte age ;
    private String sex;

    public static void say(){
        System.out.println("啦啦啦！！！");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(String name, byte age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Student(){}
}
