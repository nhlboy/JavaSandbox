package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long LongChallenge = 50000L + (byteValue + shortValue + intValue)*10L;
        System.out.println("LongChallenge = " +LongChallenge);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Short Total = " +shortTotal);
    }
}
