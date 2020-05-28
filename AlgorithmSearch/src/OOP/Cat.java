package OOP;


public class Cat {

    protected String name;
    private int age;
    private static int count;

    // констуртор - это метод, который вызывается в момент создания экзмепляра класса

    public Cat() { // по умолчанию в каждом классе существует конструктр без парметров
    count++;
    }
    // как толкьо создаем констурктор с парметрами, пустой конструктор исчезает
    // поэтому, после создания констуртора без парметров, нужно создать
    // коснтурктор с парметрами, чтобы иметь возможность им пользоваться
    public Cat(String name, int age) {

        // this - это указатель на текущий объект
        //  this.name - это поле текущего объекта

        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
// метод toString обеспечивает строковое представление объекта
    @Override
    public String toString() {
        return "Имя моего кота " + this.name + " возраст моего кота " + this.age;
    }

    public static int getCount() {
        return count;
    }
}
