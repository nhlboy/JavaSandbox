package HomeWork;

public class Age {

    private int year = 0;

    public int getAge() {
        return year;
    }

    synchronized void increment() {


        year = 1983;
        for (int i = 1; i <= 36; i++) {
            System.out.printf("%d \n", year);
            year++;

        }
    }
}
