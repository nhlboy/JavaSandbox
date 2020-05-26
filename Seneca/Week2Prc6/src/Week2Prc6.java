import java.util.Scanner;

public class Week2Prc6 {

    public static void main(String[] args) {

// Declare variable
        double score1, score2, score3, total, average;
        for(int i=0; i<5; i++)


        Scanner in = new Scanner(System.in);

// Read input data
        System.out.print("Please enter the Math score: ");
        score1 = in.nextDouble();
        System.out.print("Please enter the English score: ");
        score2 = in.nextDouble();
        System.out.print("Please enter the Science score: ");
        score3 = in.nextDouble();


// Processing
        total = score1+score2+score3;
        average = total/3;

// Output
        System.out.print(average);
    }


}

