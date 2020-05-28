public class Exersise2Q1 {

    public static void main(String[] args) {
        double fahrenheit;

        //fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println("Celsius             Fahrenheit");
        System.out.println("------------------------------");
       for (int celsius = 0; celsius <=10; celsius +=2) {
           System.out.print(celsius);
           System.out.print("                        ");
           System.out.println(celsius * 9.0 / 5.0 + 32);
        }
    }
}
