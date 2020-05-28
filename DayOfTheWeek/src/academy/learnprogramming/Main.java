package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printDayOfTheWeekSwicth(9);
        printDayOfTheWeekIfElse(9);

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");

    }

    public static void printDayOfTheWeekSwicth(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusrday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }

    public static void printDayOfTheWeekIfElse(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}

// Write a method with the name printDayOfTheWeek that has
// one parameter of type int and name it day.
//
// The method should not return any value (hint: void)
//
// Using a switch statement print ÅgSundayÅh, ÅgMondayÅh,
// Åc ,ÅgSaturdayÅh if the int parameter ÅgdayÅh is 0, 1, Åc ,
// 6 respectively, otherwise it should print ÅgInvalid dayÅh.
//
// Bonus:
// Write a second solution using if then else, instead of using switch.
// Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh
