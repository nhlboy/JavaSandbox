package OOP;

public class Main {
    public static void main(String[] args) {
        // FamilyMember - имя класса
        // human1 - имя объекта
        //  new FamilyMember - вызов конструтора класса
        // создание экзмепляра класса FamilyMember:
        // у объекта есть имя human1
        // new FamilyMember - выделется память, где будет храниться этот объект

        Cat cat = new Cat();
        cat.name = "Barsik";

        FamilyMember human1 = new FamilyMember();

        human1.setName("Таня");
        human1.setType("жена");
        human1.setAge(35);
        human1.setHairColor("блондинка");
        System.out.println(human1);

        FamilyMember human2 = new FamilyMember();
        human2.setName("Кирилл");
        human2.setType("муж");
        human2.setAge(36);
        human2.setHairColor("нет волос");
        System.out.println(human2);

        FamilyMember human3 = new FamilyMember();
        human3.setName("Данила");
        human3.setType("Страрший Засранец");
        human3.setAge(10);
        human3.setHairColor("серые");
        System.out.println(human3);

        FamilyMember human4 = new FamilyMember();
        human4.setName("Тим");
        human4.setType("Младший засранец");
        human4.setAge(4);
        human4.setHairColor("серые");
        System.out.println(human4);

        FamilyMember human5 = new FamilyMember();
        human4.setName("Хаус");
        human4.setType("Самый наглый лабрадор в Мире");
        human4.setAge(11);
        human4.setHairColor("черные");
        System.out.println(human4);

        FamilyMember human6 = new FamilyMember("Матвей", "brother", 28, "bold");
        System.out.println(human6);

        System.out.println(CompanyMember.getCount());

        CompanyMember human7 = new CompanyMember("Billy", "Irish", 42, "red", "manager");
        System.out.println(human7);

        human7.voice("Hello");
        System.out.println(human7.voice("hi", "bye"));

        human7.voice("one", "two", "three");

        FamilyMember[] familyArray = new FamilyMember[4];
        familyArray[0] = human1;
        familyArray[1] = human2;
        familyArray[2] = human3;
        familyArray[3] = human4;
        for(int i = 0; i < familyArray.length; i++) {
            System.out.println(familyArray[i]);
        }

        FamilyMember m;
        m = familyArray[0];
        familyArray[0] = familyArray[3];
        familyArray[3] = m;
        for(int i = 0; i < familyArray.length; i++) {
            System.out.println(familyArray[i]);
        }


    }


}
