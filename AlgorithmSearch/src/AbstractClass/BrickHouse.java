package AbstractClass;

public class BrickHouse extends AbstractHouse {
    @Override
    public void roof() {
        System.out.println("aluminum");

    }

    @Override
    public void wall() {
        System.out.println("brick wall");

    }

    @Override
    public void basement() {
        System.out.println("concrete basement");
    }


}
