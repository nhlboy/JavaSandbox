package forLoop;

public class TestSolution {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!WhileChallenge.isEvenNumber(number)); {
                continue;
            }

            System.out.println();
        }

    }
}

// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found