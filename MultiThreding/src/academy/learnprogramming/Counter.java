package academy.learnprogramming;

public class Counter {
    private int x = 0;

    public int getX() {
        return x;
    }

    synchronized void increment(){


//       x=1;
//        for (int i = 1; i < 5; i++){
//            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
//            try{
//                Thread.sleep(100);
//            }
//            catch(InterruptedException e){}
        }
    }
