package MMA;

public class Camp implements Divisions {
    @Override
    public Weight getLightWeight() {
        return new LightWeight();
    }

    @Override
    public Weight getMiddleWeight() {
        return new MiddleWeight();
    }

    @Override
    public Weight getHeavyWeight() {
        return new HeavyWeight();
    }
}
