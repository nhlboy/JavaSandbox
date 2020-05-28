package academy.learnprogramming;

public class NewRunnable implements Runnable{

    Counter counter;
    NewRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
    // объект монитора (одновременно с объектом может рабоать только один поток)
//        synchronized(counter){
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                this.counter.increment();
                System.out.println(Thread.currentThread().getName() + " " + i + " " + counter.getX());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//        }

        }
    }
}
