package forLoop;

public class WhileChallenge {



    public static boolean isEvenNumber(int number) {
        int remainder = number % 2;
        if(remainder == 0) {
            System.out.println("The " + number + "is even");
            return true;
        } else {
            System.out.println("The" + number + "is odd");
            return false;
        }
    }

}


// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;