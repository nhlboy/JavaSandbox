package Lambda;

// функциональный интерфейс
interface Expression {
    boolean isEqual(int n);
}

// класс, в котором определены методы
class ExpressionHelper {

    static boolean isEven(int n) {

        return n % 2 == 0;
    }

    static boolean isPositive(int n) {

        return n > 0;
    }
}

public class LambdaApp {

    public static void main(String[] args) {

        int[] massive = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(sum(massive, new Expression() {
            @Override
            public boolean isEqual(int n) {
                return false;
            }
        }));

        UserBuilder userBuilder = User::new; //реализовал фукциональный интерфейс с помощью констрткора класса user Builder

        User user = userBuilder.create("Kirill");
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
}

interface UserBuilder {
    User create(String name);
}

class User {

    private String name;

    String getName() {
        return name;
    }

    User(String n) {
        this.name = n;
    }
}