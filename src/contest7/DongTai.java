package contest7;

import java.util.*;

public class DongTai {
    static int[] pre = new int[300];// 前缀
    static int[] suf = new int[30];// 后缀
    static int num;
    static int l = 1;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        num = cin.nextInt();
        while (renum() < num) {// 获取最短字串长
            ++l;
            MaxStr(l);
        }
        getans(num, l);// 获得目标字串
        for (int i = 0; pre[i] != 0; i++) {
            System.out.print((char) pre[i]);
        }

    }

    public static int renum() {// 计算逆序数
        int cnt = 0;
        for (int i = 0; pre[i] != 0; ++i) {
            for (int j = i; pre[j] != 0; ++j) {
                if (pre[i] > pre[j]) {
                    ++cnt;
                }
            }
        }
        for (int i = 0; pre[i] != 0; ++i) {
            for (int j = 25; j >= 0; --j) {
                if (pre[i] - 'a' > j) {
                    cnt += suf[j];
                }
            }
        }
        int temp = 0;
        for (int i = 0; i < 26; ++i) {
            cnt += temp * suf[i];
            temp += suf[i];
        }
        return cnt;
    }

    public static void MaxStr(int l) {// 获取前缀确定且长度确定的前提下的最大逆序数字串
        reset();
        for (int i = 0; pre[i] != 0; ++i, --l)
            ;
        while (l > 0) {
            set();
            --l;
        }
    }

    public static void reset() {// 清除后缀
        int i = 0;
        while (i < 26 && suf[i] != 0) {
            suf[i] = 0;
            ++i;
        }
    }

    public static void set() {// 在后部序列中插入元素，保证逆序数最大
        int max = 0, temp = 0, index = 0;
        for (int i = 0; i < 26; ++i) {
            suf[i]++;
            if ((temp = getRe(i)) > max) {// 找出使逆序数增得最快的字符插入
                index = i;
                max = temp;
            }
            suf[i]--;
        }
        suf[index]++;
    }

    public static int getRe(int c) {// 获取最大逆序数
        int i = 0, cnt = 0;
        while (pre[i] != 0) {
            if (pre[i] > (c + 'a')) {
                cnt++;
            }
            ++i;
        }
        for (i = 0; i < 26; ++i) {
            if (i != c) {
                cnt += suf[i];
            }
        }
        return cnt;
    }

    public static void getans(int num, int l) {
        for (int i = 0; i < l; ++i) {
            for (int j = 0; j < 26; ++j) {
                pre[i] = j + 'a';
                MaxStr(l);
                if (renum() >= num) {
                    break;
                }
            }
        }
    }

}
