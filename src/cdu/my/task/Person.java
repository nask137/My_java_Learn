package cdu.my.task;

public class Person {
    private  String name;
    private byte age;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void   say(){
        System.out.println("静态的我会说话！！");
    }
    public void say2(){
        System.out.println("非静态的我会说话！！！");
    }
    public Person() {
    }

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
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

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
