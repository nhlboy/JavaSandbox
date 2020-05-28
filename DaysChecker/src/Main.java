public class Main {

    public static void main(String[] args) {
        DaysChecker(4, 23);
    }

    public static boolean DaysChecker(int weekday, int october) {
        if (weekday == 3 || weekday == 4) { // day 3 is Wednesday and day 4 is Thursday
            if (october != 14 && october != 21 && october != 22 && october != 23 && october != 24 && october != 25)
                System.out.println("You have classes");
            return true;
        } else
            System.out.println("No classes");
        return false;

    }
}

//        if (weekday == 0) {
//            System.out.println("Sunday. No classes.");
//            return false;
//        } else if (weekday == 1) {
//            System.out.println("Monday. No classes.");
//            return false;
//        } else if (weekday == 2) {
//            System.out.println("Tuesday. You have classes.");
//            return true;
//        } else if (weekday == 3) {
//            System.out.println("Wednesday. You have classes.");
//            return true;
//        } else if (weekday == 4) {
//            System.out.println("Thursday. No classes.");
//            return false;
//        } else if (weekday == 5) {
//            System.out.println("Friday. No classes.");
//            return false;
//        } else if (weekday == 6) {
//            System.out.println("Saturday. No classes.");
//            return false;
//        } else if (october == 14) {
//            System.out.println("Thanksgiven. No classes");
//            return false;
//        } else if (october == 21) {
//            System.out.println("Study week. No classes");
//            return false;
//        } else if (october == 22) {
//            System.out.println("Study week. No classes");
//            return false;
//        } else if (october == 23) {
//            System.out.println("Study week. No classes");
//            return false;
//        } else if (october == 24) {
//            System.out.println("Study week. No classes");
//            return false;
//        } else if (october == 25) {
//            System.out.println("Study week. No classes");
//            return false;
//        } else {
//            System.out.println("Invalid day");
//            return false;
//        }
//    }
//}





