package Car;

public class MainCar {

    public static void main(String[] args) {

        Truck volvo = new Truck();

        Bolid bolid = new Bolid();

        //массив объектов, которые реализовали интерфейс Car
        Car[] cars = new Car [2];

        cars[0] = volvo;
        cars[1] = bolid;
        for(int i = 0; i < cars.length; i++) {
            cars[i].engine();

        }

        // реализация интерфейса напрямую
        Car car = new Car() {
            @Override
            public void fuel() {
                System.out.println("Gold 89");
            }

            @Override
            public void engine() {
                System.out.println("DD13");

            }
        };

        car.fuel();
        // реализуем интерфейс Car  c помощью констурктора Bolid
        Car car1 = new Bolid();
    }
}
