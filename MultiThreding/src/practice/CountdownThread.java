package practice;

public class CountdownThread extends Thread {

    Rocket apollo = new Rocket();

    public void run() {
        int countdown = 100;
        for(int i = 1; i >= 0; i--) {
            countdown =- i;
            System.out.println(Thread.currentThread() + "Start in " + i + " " + this.apollo);
        }
    }

}
