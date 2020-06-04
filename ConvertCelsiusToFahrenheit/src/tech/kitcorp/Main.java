package tech.kitcorp;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {

        return (9.0/5.0) * (double)celsius+32;
    }
}

// Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия.
// Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
// Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
// TF = (9 / 5) * TC + 32

// Пример:
// В метод convertCelsiusToFahrenheit на вход подается значение 41.

// Пример вывода:
// 105.8
// Требования:

