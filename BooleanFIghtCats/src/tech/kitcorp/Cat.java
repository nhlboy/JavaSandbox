package tech.kitcorp;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }


    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int scoreCountCat1 = 0;
        int scoreCountCat2 = 0;

        if (this.age > anotherCat.age) {
            scoreCountCat1++;
        } else if (this.age < anotherCat.age) {
            scoreCountCat2++;
        }
        if (this.weight > anotherCat.weight) {
            scoreCountCat1++;
        } else if (this.weight < anotherCat.weight) {
            scoreCountCat2++;
        }
        if (this.strength > anotherCat.strength) {
            scoreCountCat1++;
        } else if (this.strength < anotherCat.strength) {
            scoreCountCat2++;
        }
        return scoreCountCat1 > scoreCountCat2;


    }

    public static void main(String[] args) {

    }
}

// Реализовать метод boolean fight(Cat anotherCat):
// реализовать механизм драки котов в зависимости от их веса, возраста и силы.
// Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
// Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
// Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
// если cat1.fight(cat2) возвращает true,
// то cat2.fight(cat1) должен возвращать false.
