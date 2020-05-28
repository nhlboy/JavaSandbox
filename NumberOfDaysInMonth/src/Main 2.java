public class Main {

    public static void main(String[] args) {

// Write a method isLeapYear with a parameter of type int named year.
// The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//
// If the parameter is not in that range return false.
//
// Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
//
// A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

        System.out.println(getDaysInMonth(2, 2018));
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            System.out.println("False");
            return false;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400) == 0) {
            System.out.println("True");
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:     // Jan 31
                case 3:     // Mar 31
                case 5:     // May 31
                case 7:     // Jul 31
                case 8:     // Aug 31
                case 10:    // Oct 31
                case 12:    // Dec 31
                    return 31;
                case 4:     // Apr 30
                case 6:     // Jun 30
                case 9:     // Sep 30
                case 11:    // Nov 30
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                default:
                    return -1;

            }
        }

    }
}

// Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
//
// If parameter month is < 1 or > 12 return -1. ​
// If parameter year is < 1 or > 9999 then return -1.
//
//  This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
//
//  You should check if the year is a leap year using the method isLeapYear described above.
//
//        Examples of input/output:
//
//  * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
//  * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
//
//  * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
//
//  * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
//
//  * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.
//
//      HINT: Use the switch statement.
//
//      NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.
//
//      NOTE: Do not add a main method to solution code.


