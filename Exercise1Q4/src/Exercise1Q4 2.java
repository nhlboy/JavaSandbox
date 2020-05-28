public class Exercise1Q4 {

    public static void main(String[] args) {
        Double distanceMiles, distanceKms, time, averageSpeed;

        distanceMiles = 24.0;
        distanceKms = distanceMiles * 1.6;
        time = 1.0 + (40.0 / 60.0) + (35.0 / 3600.0);
        averageSpeed = distanceKms / time;

        double roundAverage = Math.round(averageSpeed*100.0)/100.0;

        System.out.println("Runner runs " + distanceMiles + " miles in 1 hour, 40 minutes and 35 seconds");
        System.out.print("His average Speed is " + roundAverage + " kms per hour");



    }
}
