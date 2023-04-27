package Test;

public class Student {
    private String  name;
    private int  id ;
    private int  age ;
    private char  sex ;


    public Student() {
this.name="wn";
this.age=18;
this.id=18;
this.sex='男';
    }

    public Student(String name, int id, int age, char sex) {
      this();


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
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Student{name = " + name + ", id = " + id + ", age = " + age + ", sex = " + sex + "}";
    }
}
