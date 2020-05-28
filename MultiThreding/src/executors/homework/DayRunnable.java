package executors.homework;

public class DayRunnable implements Runnable{


    @Override
    public void run() {
        for(int i = 0; i < 365; i++) {
            int day =+i;
            System.out.println("Today's day # " + day);
        }

    }
}
