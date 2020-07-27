package tech.kitcorp;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human grandfatherOne = new Human("Ded 1", true, 81);
        Human grandfatherTwo = new Human("Ded 2", true, 82);
        Human grandmotherOne = new Human("Babka 1", false, 81);
        Human grandmotherTwo = new Human("Babka 2", false, 82);

        Human father = new Human("Батя", true, 36, grandfatherOne, grandmotherOne);
        Human mother = new Human("Мать", false, 36, grandfatherTwo, grandmotherTwo);
        Human sonOne = new Human("Daniel", true, 11, father, mother);
        Human sonTwo = new Human("Timurka", true, 5, father, mother);
        Human daughterOne = new Human("Eva", false, 1, father, mother);

        System.out.println(grandfatherOne.toString());
        System.out.println(grandfatherTwo.toString());
        System.out.println(grandmotherOne.toString());
        System.out.println(grandmotherTwo.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(sonOne.toString());
        System.out.println(sonTwo.toString());
        System.out.println(daughterOne.toString());

    }

    public static class Human {



        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}

// Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).

// Создай объекты и заполни их так, чтобы получилось:
// Два дедушки,
// две бабушки,
// отец,
// мать,
// трое детей.
// Вывести объекты на экран.

// Примечание:
// Если написать свой метод String toString() в классе Human, то именно он будет
// использоваться при выводе объекта на экран.

// Пример вывода:
// Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
// Имя: Катя, пол: женский, возраст: 55
// Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
// ...
// Требования:

//     •
//     Программа не должна считывать данные с клавиатуры.
//     •
//     Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//     •
//     Добавить в класс конструктор public Human(String name, boolean sex, int age).
//     •
//     Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
//     •
//     Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
//     •
//     Выведи созданные объекты на экран.