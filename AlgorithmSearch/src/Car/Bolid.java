package Car;

public class Bolid extends RaceCar {
    @Override
    public void spoiler() {
        System.out.println("bolid spoiler");
    }

    @Override
    public void fuel() {
        System.out.println("bolid fuel");

    }

    @Override
    public void engine() {
        System.out.println(engine("diesel"));

    }

    // overload - перегрузка. поменяли сигнатуру метода
    public String engine(String s) {
        return s;
    }
}
