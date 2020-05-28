package FactoryMethod.DeliveryCompany;

public class LogisticsCompany {

    public static void main(String[] args) {

        // анонимный объект - объек без имени. использует тогда, когда
        // мы не осбираемся второй раз пользоватсья объектом

        Logistic[] logistics = {new RoadLogistic(), new SeaLogistics(), new SkyLogistic()};
        for (Logistic logistic: logistics) {
            logistic.byTransport().move();
        }
    }
}
