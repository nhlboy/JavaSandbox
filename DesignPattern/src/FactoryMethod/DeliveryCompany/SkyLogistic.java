package FactoryMethod.DeliveryCompany;

public class SkyLogistic extends Logistic {
    Transport transport;
    @Override
    public Transport byTransport() {
        transport = new Fly();
        return transport;

    }
}
