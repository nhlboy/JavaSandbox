public class Main {

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid value");
            }
            else {
                long year = minutes / (60 * 24 * 365);
                long day = minutes /(60 * 24);
                long remainingDays = day % (365);
                System.out.println(minutes + " min" + " = " + year + " y" + " and " + remainingDays + " d");
            }
        }
}