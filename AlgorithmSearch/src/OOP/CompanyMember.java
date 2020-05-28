package OOP;

// насоледование - это возможность создавать новый класс на основании предыдщуего
public class CompanyMember extends FamilyMember {
    // класс CompanyMember наследует все поля и методы у класс FamilyMember

    private String position;

    public CompanyMember(String name, String type, int age, String hairColor, String position) {
        super(name, type, age, hairColor); // вызываем констурктор предка

        this.position = position;  // инициализируем уникальное поле, которого не было в классе предка
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //переопределение - это задание новой логики методу
    @Override
    public void voice(String s) {
        System.out.println("!!! " + s);
    }

    // перегрузка (overloading) - имя метода одно и то же, а колчиесво параметров разное
    public String voice(String s, String s1) {
        return s + s1;

    }

    public void voice(String s, String s1, String s3) {
        System.out.println(s + "" + s1 + "" + s3);
    }
    @Override
    public String toString() {
        return super.toString()+ " position " + this.position;
    }
}

