package practice;

public class RocketRun implements Runnable {

    int count;

    @Override
    public void run() {
        for(int i = 100; i <= 0; i--) {
            count =-i;
            System.out.println(Thread.currentThread() + " " + count);
        }

    }
}
