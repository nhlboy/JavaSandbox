package HomeWork;

import java.util.concurrent.Callable;

public class CallableTwo implements Callable <Integer> {
    int year = 0;

    public CallableTwo(int year) {
        this.year = year;
    }

    @Override
    public Integer call() throws Exception {
        return getYearCount(year);
    }

    public int getYearCount(int year) {
        int count = 0;
        while(year != 0) {
            year /= 10;
            count++;
        }
        return count;
    }
}
