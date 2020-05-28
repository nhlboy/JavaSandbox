package AbstractClass;

public abstract class AbstractHouse implements Building {
    @Override
    public void paperwork() {
        System.out.println("paperwork");
    }

    public void basement() {
        System.out.println("basement");

    }
    public abstract void roof();
    public abstract void wall();


}
