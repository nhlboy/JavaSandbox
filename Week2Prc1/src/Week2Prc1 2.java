import java.util.Scanner;

public class Week2Prc1 {

    public static void main(String[] args) {

// Declare variables
        double score1, score2, score3, total, average;

        Scanner in = new Scanner(System.in);

// Read input data
        System.out.print("Please enter the first score: ");
        score1 = in.nextDouble();
        System.out.print("Please enetr the second score: ");
        score2 = in.nextDouble();
        System.out.print("Please enter the third score: ");
        score3 = in.nextDouble();


// Processing
        total = score1+score2+score3;
        average = total/3;

// Output
        System.out.println("Total score is: " +total);
        System.out.println("Average score is: " +average);
    }


}