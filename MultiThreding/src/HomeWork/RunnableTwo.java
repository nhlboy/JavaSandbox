package HomeWork;

public class RunnableTwo implements Runnable {

    Age age;

    public RunnableTwo(Age year) {
        this.age = year;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 36; i++) {
            age.increment();
            System.out.println(Thread.currentThread().getName() + " " + i + " " + age.getAge());

        }

    }
}
