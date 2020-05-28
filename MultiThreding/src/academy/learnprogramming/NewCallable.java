package academy.learnprogramming;

import java.util.concurrent.Callable;

public class NewCallable implements Callable <Integer> {
    int number = 0;

    public NewCallable(int number) {
        this.number = number;

    }

    @Override
    public Integer call() throws Exception {

        return getDigitCount(number);
    }
    public int getDigitCount(int number) {
        int count = 0;
        while(number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
