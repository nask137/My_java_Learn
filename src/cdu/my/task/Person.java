package cdu.my.task;

public class Person {
    private  String name;
    private byte age;
    private String sex;
 public static void study(){
     System.out.println("正在学习");
 }

    public Person() {
    }

    public Person(String name, byte age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public byte getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
