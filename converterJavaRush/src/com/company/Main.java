package com.company;

/*
Наш первый конвертер!
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {

        return ((((9.0/5.0)) * (double)celsius)+32);
    }
}