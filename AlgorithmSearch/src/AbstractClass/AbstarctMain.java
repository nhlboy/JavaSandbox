package AbstractClass;

public class AbstarctMain  {
    public static void main(String[] args) {

        Employer employer = new Employer();
        System.out.println(employer.work());

        Contractor contractor = new Contractor();
        System.out.println(contractor.work());

        Integer[] arrayInt = new Integer[4];
        String[] stringArray = new String[4];
        String[] stringArr = {"string1", "string2", "string3"};
        Human[] humans = {new Contractor(), new Employer(), new Contractor()};

        Human[] humanMassive = new Human[4];
        humanMassive[0] = contractor;
        humanMassive[1] = employer;
        humanMassive[2] = new Contractor();
        humanMassive[3] = new Employer();

        WoodenHouse woodenHouse1 = new WoodenHouse();
        woodenHouse1.basement();
        woodenHouse1.roof();
        woodenHouse1.wall();

        BrickHouse brickhouse1 = new BrickHouse();
        brickhouse1.basement();
        brickhouse1.roof();
        brickhouse1.wall();

        AbstractHouse[] houses = new AbstractHouse[2];
        houses[0] = woodenHouse1;
        houses[1] = brickhouse1;
        System.out.println("________________________");

        int i;
        for(i = 0; i < houses.length; i++) {
            houses[i].wall();
        }


    }
}
