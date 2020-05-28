package AbstractClass;

// абстрактный класс не имеет собственнй реализации
// может иметь абстраткные методы

public abstract class Human {

    private String name;

    public String getName() {
        return name;

    }

    // абсраткный методы - не имеет тела
    public abstract String work();

}