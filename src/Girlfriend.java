public class Girlfriend {
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
        return "Girlfriend{name = " + name + ", age = " + age + ", shengao = " + shengao + "}";
    }
}
