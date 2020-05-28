package executors.homework;

import java.util.concurrent.Callable;

public class DayCollable implements Callable <Integer>{

    DayCollable day;

    public void run() {

    }

    @Override
    public Integer call() throws Exception {
        Integer integer = 0;
        for(int i = 0; i < 365; i++) {
            System.out.println(Thread.currentThread() + " " + i + " " + this.day);
        integer += i;
        }
        return integer;
    }
}
