package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        checkNumber(0);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else if (number == 0) {
            System.out.println(number + " is Zero");
        }

    }
}

//    Write a method called checkNumber with an int parameter number
//        The method should not return any value and it needs to print out
//
//        “Positive” - if the parameter number is >0
//        "Negative" if the parameter number is < 0
//        "Zero" if the parameter number is equal to 0
//
//        Note the checkNumber method need to be defined as public static like we have been doing so far in the course
//
