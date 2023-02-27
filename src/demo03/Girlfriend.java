package demo03;

import java.util.Objects;

public class Girlfriend implements Comparable<Girlfriend>{
    private  String  name;
    private int age ;
    private double shengao;

    public Girlfriend() {
    }

    public Girlfriend(String name, int age, double shengao) {
        this.name = name;
        this.age = age;
        this.shengao = shengao;
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

    /**
     * 获取
     * @return shengao
     */
    public double getShengao() {
        return shengao;
    }

    /**
     * 设置
     * @param shengao
     */
    public void setShengao(double shengao) {
        this.shengao = shengao;
    }

    public String toString() {
        return "demo03.Girlfriend{name = " + name + ", age = " + age + ", shengao = " + shengao + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girlfriend that = (Girlfriend) o;
        return age == that.age && Double.compare(that.shengao, shengao) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, shengao);
    }

    @Override
    public int compareTo(Girlfriend o) {
        return o.getAge()-this.getAge();
    }
}
