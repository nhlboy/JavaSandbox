

public class Week2Prc5 {
    public static void main(String[] args) {
        //Practice with Loops!


        //Declaring variable
        int loopCounter;

        //initialize the loop variable

        loopCounter = 100;

        while (loopCounter >= 10) {
            System.out.println(loopCounter);

            //loopCounter = loopCounter - 10;
            loopCounter = loopCounter - 10;
        }


        //DO .. WHILE Loop
        // initialize the loop variable
        loopCounter = 100;
        do {
            System.out.print(loopCounter + ",");

            //loopCounter = loopCounter +1
            loopCounter = loopCounter - 10;
            //loopCounter -= 10;

        } while (loopCounter >= 10);

        //FOR .. WHILE Loop
        // initialize the loop variable
        for (loopCounter = 100; loopCounter >= 10; loopCounter = loopCounter - 10;);{
            System.out.print(loopCounter + ",");


        }

    }