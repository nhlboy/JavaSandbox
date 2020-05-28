package FactoryMethod.DeliveryCompany;

public class Ship implements Transport {

    @Override
    public void move() {
        System.out.println("Move by sea and river");
    }
}
