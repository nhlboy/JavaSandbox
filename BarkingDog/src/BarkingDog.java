public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking == true) {
            if ((hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23))
                return true;
            else
                return false;
        }
        return false;
    }

}
