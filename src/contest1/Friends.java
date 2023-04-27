package contest1;

import java.util.Comparator;

public class Friends implements Comparable<Friends> {
    private  String name;
    private  int age ;

    public Friends() {
    }
    public Friends(String name, int age) {
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

    public String toString() {
        return "Friends{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Friends o) {
        return this.age-o.age;
    }
}
