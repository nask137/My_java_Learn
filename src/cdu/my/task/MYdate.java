package cdu.my.task;

import java.util.Objects;

public class MYdate {
    private int  year;
    private int  month;
    private int  day;
    public MYdate() {
    }
    public MYdate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /**
     * 获取
     * @return year
     */
    public int getYear() {
        return year;
    }
    /**
     * 设置
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * 获取
     * @return month
     */
    public int getMonth() {
        return month;
    }
    /**
     * 设置
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }
    /**
     * 获取
     * @return day
     */
    public int getDay() {
        return day;
    }
    /**
     * 设置
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MYdate mYdate = (MYdate) o;
        return year == mYdate.year && month == mYdate.month && day == mYdate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    public String toString() {
        return "MYdate{year = " + year + ", month = " + month + ", day = " + day + "}";
    }
}
