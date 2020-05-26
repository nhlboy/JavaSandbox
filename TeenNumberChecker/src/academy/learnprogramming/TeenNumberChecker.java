package academy.learnprogramming;

public class TeenNumberChecker {

    //        Write a method named hasTeen with 3 parameters of type int.
    //
    //        The method should return boolean and it needs to return true if
    //        one of the parameters is in range 13(inclusive) - 19 (inclusive).
    //        Otherwise return false.
    //
    //
    //        EXAMPLES OF INPUT/OUTPUT:
    //
    //        * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
    //
    //        * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
    //
    //        * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
    //

    public static boolean hasTeen(int age1, int age2, int age3) {

        if (age1 >= 13 && age1 <= 19 || age2 >= 13 && age2 <= 19 || age3 >= 13 && age3 <= 19) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }

    }

    public static boolean isTeen(int age4) {
        if (age4 >= 13 && age4 <= 19) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}


//
//        Write another method named isTeen with 1 parameter of type int.
//
//        The method should return boolean and it needs to return true if
//        the parameter is in range 13(inclusive) - 19 (inclusive).
//        Otherwise return false.
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * isTeen(9);  should return false since 9 is in not range 13 - 19
//
//        * isTeen(13);  should return true since 13 is in range 13 - 19
//
