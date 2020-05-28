package FactoryMethod.DeliveryCompany;

public class Fly implements Transport {
    @Override
    public void move() {
        System.out.println("Move by sky");
    }
}
