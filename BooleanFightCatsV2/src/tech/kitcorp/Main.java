package tech.kitcorp;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Dana White", 3, 3, 50);
        Cat cat2 = new Cat("McGregor", 2, 2, 55);
        Cat cat3 = new Cat("Khabib", 3 , 2,65 );

        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat1));
        System.out.println(cat3.fight(cat2));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}

// Создать три кота используя класс Cat.
// Провести три боя попарно между котами.
// Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
// Результат каждого боя вывести на экран c новой строки.