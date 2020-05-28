package OOP;

public class FamilyMember {

    private String name;
    private String type;
    private int age;
    private String hairColor;
    // статическое поле принадлежит классу. существует в единсвенном экземпляре

    private static int count;

    public FamilyMember() {
        count++;

    }

    public FamilyMember(String name, String type, int age, String hairColor) {

        this.name = name;
        this.type = type;
        this.age = age;
        this.hairColor = hairColor;

        count++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public static int getCount() {
        return count;
    }

    public void voice (String s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return this.name + " это " + this.type + ". Ей/ему " + this.age + " лет. Цвет волос: " + this.hairColor;
    }


}




