package academy.learnprogramming;

public class ForStatement<interestRate> {

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }




//    public static boolean isPrime(int n) {
//
//        if(n ==1) {
//            return false;
//        }
//
//        for(int i = 2; i <= n/2; i++) {
//            if(n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

}





// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit