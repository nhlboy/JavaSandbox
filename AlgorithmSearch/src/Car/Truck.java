package Car;

public class Truck implements Car {


    @Override
    public void fuel() {
        System.out.println("truck fuel");
    }

    @Override
    public void engine() {
        System.out.println("engine Cummins");

    }
}
