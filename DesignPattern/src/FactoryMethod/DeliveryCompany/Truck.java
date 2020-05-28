package FactoryMethod.DeliveryCompany;

public class Truck implements Transport {

    @Override
    public void move() {
        System.out.println("Move by road");
    }
}
