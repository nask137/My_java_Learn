package contest4;

import java.util.concurrent.Callable;

public class Mythread3 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum++;
        }

        return sum;
    }
}
