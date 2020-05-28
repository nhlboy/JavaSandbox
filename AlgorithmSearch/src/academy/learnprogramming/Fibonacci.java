package academy.learnprogramming;

public class Fibonacci {
    public static void main(String[] args){

        //System.out.println(fibonacci(9));
        System.out.println(factorial(3));

    }
    public static int fibonacci (int n) {
        int element1 = 1;
        int element2 = 1;
        int element3 = 0;

        for (int i = 3; i <= n; i++) {
            element3 = element2 + element1;
            element1 = element2;
            element2 = element3;
        }
        return element3;

    }


    public static int factorial(int number) {

        int factorialResult = 1;
//        for (int a = 1; a <= number; a++) {
//            factorialResult = factorialResult * a;
//        }
        if (number == 1 || number == 0) {
            return factorialResult;
        }
        System.out.println(number);
        factorialResult = number * factorial (number - 1);

        return factorialResult;

    }
}