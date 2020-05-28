package practice;

import java.util.concurrent.Callable;

public class RocketCall implements Callable {

    @Override
    public Object call() throws Exception {
        return coundown(100);
    }

    public int coundown(int seconds) {
        int countdown = 0;
        while(seconds != 0) {
            seconds--;
        }
        return countdown;
    }
}
