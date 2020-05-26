package tech.kitcorp;

/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1  = reader.readLine();
        return s1;

    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s2  = reader.readLine();
        int i = Integer.parseInt(s2);
        return i;

    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s3  = reader.readLine();
        double d = Double.parseDouble(s3);
        return d;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s4  = reader.readLine();
        boolean b = Boolean.parseBoolean(s4);
        return b;

    }

    public static void main(String[] args) throws Exception {

    }
}

// Сделать класс ConsoleReader, у которого будут 4 статических метода:
// String readString() - читает с клавиатуры строку
// int readInt() - читает с клавиатуры число
// double readDouble() - читает с клавиатуры дробное число
// boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

// Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
// Требования:

//     •
//     Метод readString должен считывать и возвращать строку(тип String).
//     •
//     Метод readInt должен считывать и возвращать число(тип int).
//     •
//     Метод readDouble должен считывать и возвращать дробное число(тип double).
//     •
//     Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).
