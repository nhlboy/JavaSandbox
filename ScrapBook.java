public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + caculateInterest(10000, 2));

        for (int i = 0; i < 5; i++) {

            System.out.println("Loop " + i + " hello");
        }
        // using the FOR statement, call the calaculateInterest method with
        // the amount of 10000 with an interest of 2, 3, 4, 5, 6, 7, and 8
        // and print the results to the concole window

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", caculateInterest(10000, i)));

        }

        // How would you modify the for loop above to do the same thing as
        // shown but start from 8% and work back to 2%

        System.out.println("****************");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", caculateInterest(10000, i)));

        }


        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // if that count is 3 exit the for loop
        // hint: Use the break; statement to exit

        System.out.println("----------");
        int count = 0;
        for (int i = 1; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }

            public static boolean isPrime ( int n){

                if (n == 1) {
                    return false;
                }

                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        return false;
                    }

                    return true;
                }

                public static double caculateInterest (double amount, double interestRate){
                    return (amount * (interestRate / 100));
                }
            }


        }

        count = 6
    }
}