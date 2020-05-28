package FactoryMethod.DeliveryCompany;

public class RoadLogistic extends Logistic {
    // объявили объект
    Transport transport;

    @Override
    public Transport byTransport() {

        // инициализация объекта - выделние памяти
        transport = new Truck();
        return transport;

    }
}
