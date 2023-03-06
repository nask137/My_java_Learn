package demo05;

public class Grilfrend {
    private  String name ;
    private  byte age;

    public Grilfrend() {
    }

    public Grilfrend(String name, byte age) {
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
       if(name.length()<3||name.length()>10){
           throw new RuntimeException();

       }
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
        if(age<18||age>40){
            throw  new RuntimeException();

        }
        this.age = age;
    }

    public String toString() {
        return "Grilfrend{name = " + name + ", age = " + age + "}";
    }
}
