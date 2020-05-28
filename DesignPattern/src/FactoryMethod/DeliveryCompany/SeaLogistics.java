package FactoryMethod.DeliveryCompany;

public class SeaLogistics extends Logistic {
    // объявили объект
    Transport transport;

    @Override
    public Transport byTransport() {

        // инициализировали объект
        transport = new Ship();
        return transport;

    }
}
