package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        getDurationString(75, 54);
        getDurationString(450);
    }

    public static void getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid value");
        } else {
            long XX = minutes / 60;
            long YY = minutes % 60;
            long ZZ = seconds;

            System.out.println(XX + "h " + YY + "m " + ZZ + "s");

        }
    }

        public static void getDurationString(long seconds) {
            if (seconds <= 0) {
                System.out.println("Invalid value");
            }
            long secondsTominutes = seconds / 60;
            long secondToMinutesRemainder = seconds % 60;

            System.out.println(secondsTominutes +" minutes and " + secondToMinutesRemainder +" seconds");
        }
    }

