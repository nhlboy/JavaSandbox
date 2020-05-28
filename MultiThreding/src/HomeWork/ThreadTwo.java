package HomeWork;

public class ThreadTwo extends Thread {
    Age age;


    public void run() {
        for(int i = 0; i < 36; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i + " " + this.age.getAge());
        }
    }
}
