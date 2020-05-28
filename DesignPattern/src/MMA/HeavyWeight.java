package MMA;

public class HeavyWeight implements Weight {
    @Override
    public int getStamina() {
        return 75;
    }

    @Override
    public int getSpeed() {
        return 45;
    }

    @Override
    public int getStrikes() {
        return 100;
    }
}
