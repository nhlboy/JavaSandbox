package academy.learnprogramming;

public class ForLoopWithBreaker {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
            }
            if (count == 3) {
                System.out.println("Exiting loop");
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit