package academy.learnprogramming;

public class TeenNumberChecker {

    public static boolean hasTeen(int teen1, int teen2, int teen3) {
        if (teen1 >= 13 && teen1 <= 19) {
            return true;
        } else if (teen2 >= 13 && teen2 <= 19) {
            return true;
        } else if (teen3 >= 13 && teen3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int teen) {
        if (teen >= 13 && teen <= 19) {
            return true;
        } else {
            return false;
        }
    }
}



// The method should return boolean and it needs to return true if the 
// parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
// EXAMPLES OF INPUT/OUTPUT:
//
// * isTeen(9);  should return false since 9 is in not range 13 - 19
//
// * isTeen(13);  should return true since 13 is in range 13 - 19
//
// NOTE: All methods need to be defined as public static like we have 
// been doing so far in the course.
// NOTE: Do not add a  main method to solution code.