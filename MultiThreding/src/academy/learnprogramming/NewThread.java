package academy.learnprogramming;

public class NewThread extends Thread {
    Counter counter;


    public NewThread(String name, Counter counter) {
        super(name);
        this.counter = counter;

    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                //  усыпляем поток на 500 милисекунд
                Thread.sleep(500);
                this.counter.increment();
                System.out.println(Thread.currentThread().getName() + " " + i + " " + this.counter.getX());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}

