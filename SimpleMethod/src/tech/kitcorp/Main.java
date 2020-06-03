package tech.kitcorp;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqr(5));
        sum(2, 2);
    }

    // Method with return
    public static int sqr(int a) {
        return a * a;
    }

    //Method with println
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}

