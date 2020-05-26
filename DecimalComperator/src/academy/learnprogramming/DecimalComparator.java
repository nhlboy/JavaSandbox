package academy.learnprogramming;

// The purpose of using the int data type is to ensure we get a whole number
// when comparing the values
// Multiplying the int values by 1000, ensures we are comparing to 3 decimals
// (in this case will be the rounding off to the nearest 3 decimals)
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        int newNum1 = (int)(num1 * 1000);
        int newNum2 = (int)(num2 * 1000);
        if (newNum1 == newNum2) {
            System.out.println(" (" +  num1 + ", " + num2 + ") " + " numbers are equal to 3 decimal places");
            return true;
        } else
        {
            System.out.println("(" +  num1 + ", " + num2 + ") " + " numbers are not equal to 3 decimal places");
            return false;
        }
    }
}