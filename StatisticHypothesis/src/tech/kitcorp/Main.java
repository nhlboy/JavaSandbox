package tech.kitcorp;

public class Main {

    public static void main(String[] args) {

        double power = 2;

        double x1 = 53330311.87;
        double x2 = 61193235.57;
        double n1 = 15;
        double n2 = 60;
        double s1 = 28378855.62;
        double s2 = 42790360.92;

        double sp = ((n1-1)*Math.pow(s1, power)+(n2-1)*Math.pow(s2, power))/(n1+n2-2);

        double t = (x1 - x2) / Math.sqrt(sp*(1/n1 + 1/n2));

        System.out.println("Sp = " + sp);
        System.out.println("t = " +t);
        System.out.println();

        if(t < -1.994 || t > 1.994) {
            System.out.println("Reject H0");
        } else {
            System.out.println("Do not reject H0");
        }


//        if(t > 1.667) {
//            System.out.println("Reject H0");
//        } else {
//            System.out.println("Do not reject H0");
//        }
    }
}

