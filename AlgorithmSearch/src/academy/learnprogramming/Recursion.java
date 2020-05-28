package academy.learnprogramming;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(fact(3));

    }
    public static void createRecursion(){
        System.out.println("Recursion ");
createRecursion();


    }

    private static Integer fact(int n) {
        System.out.println(n);
        if (n < 0) {
            System.out.println("Зачем тебе факториал из отрицательного числа?");
            return null;
        }
        int result = 1;
        if (n == 0) {
            return result;
        }
//        for (int i = 1; i <= n; i++) {
//            result = result * i;
//        }
        result = n * fact(n-1);
        return result;
    }
}
