package cdu.my.task;

public class Account {

    private static String zhanghao ="王楠";
    private static double  minmoney =0.0;
    private String password;
    private double yue ;
    private double lilv ;

    public Account() {
    }

    public Account( String password, double yue, double lilv) {

        this.password = password;
        this.yue = yue;
        this.lilv = lilv;
    }

    /**
     * 获取
     * @return zhanghao
     */
    public static String getZhanghao() {
        return zhanghao;
    }


    /**
     * 获取
     * @return minmoney
     */
    public static double getMinmoney() {
        return minmoney;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return yue
     */
    public double getYue() {
        return yue;
    }

    /**
     * 设置
     * @param yue
     */
    public void setYue(double yue) {
        this.yue = yue;
    }

    /**
     * 获取
     * @return lilv
     */
    public double getLilv() {
        return lilv;
    }

    /**
     * 设置
     * @param lilv
     */
    public void setLilv(double lilv) {
        this.lilv = lilv;
    }

    public String toString() {
        return "Account{zhanghao = " + zhanghao + ", minmoney = " + minmoney + ", password = " + password + ", yue = " + yue + ", lilv = " + lilv + "}";
    }
}
