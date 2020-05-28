package academy.learnprogramming;

public class ChessDesk {

    public static void main(String[] args) {

        for (int c = 1; c <= 4; c++) {

            for (int a = 1; a <= 8; a++) {
                if (a % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }


            }

            System.out.println("");

            for (int b = 1; b <= 8; b++) {
                if (b % 2 == 0) {
                    System.out.print("Y");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println("");
        }

        System.out.println(factorial(5));

    }

    public static int factorial (int number) {
        if (number < 0) {
            System.out.println("Факториала отрицательного числа не существует");
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static int factorialReacursion (int newNumber) {
        if (newNumber < 0) {
            System.out.println("Факториала отрицательного числа не существует");
            return 0;
        }
        int result = 1;
        if (newNumber == 1 || newNumber == 0) {
            return result;
        }
        result = newNumber * factorialReacursion(newNumber - 1);
        return result;
    }

}


