package forLoop;

public class SumOdd {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        if (end < start) {
            return -1;
        } else if(start < 0 || end < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}

// The parameter end needs to be greater than or equal to
// start and both start and end parameters have to be
// greater than 0.
//
// If those conditions are not satisfied return -1 from
// the method to indicate invalid input.
//
// Example input/output:
//
// * sumOdd(1, 100); → should return 2500
// * sumOdd(-1, 100); →  should return -1
// * sumOdd(100, 100); → should return 0
// * sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
// * sumOdd(100, -100); → should return -1
// * sumOdd(100, 1000); → should return 247500
