package AbstractClass;

import org.w3c.dom.ls.LSOutput;

public class WoodenHouse extends AbstractHouse {
    @Override
    public void roof() {
        System.out.println("metal");

    }

    @Override
    public void wall() {
        System.out.println("wooden wall");

    }

    @Override
    public void basement() {
        System.out.println("wooden basement");
    }
}
