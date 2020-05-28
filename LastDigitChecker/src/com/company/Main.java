package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); // should return true since 1 is the
        // rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(23, 32, 42)); // should return true since 2 is the
        // rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(9, 99, 999)); // should return false since 9 is not
        // within the range of 10-1000
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;
        if (a < 10 || a > 1000) {
            return false;
        } else if (b < 10 || b > 1000) {
            return false;
        } else if (c < 10 || c > 1000) {
            return false;
        } else if (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC) {
            return true;
        } else {
            return false;

        }

    }
    public static boolean isValid(int number) {
        if(number < 10 || number >1000) {
            return false;
        } else {
            return true;
        }
    }
    }

// Write another method named isValid with one parameter of type int.
//
// The method needs to return true if the number parameter is in range
// of 10(inclusive) - 1000(inclusive), otherwise return false.
//
// EXAMPLE INPUT/OUTPUT
//
// * isValid(10); → should return true since 10 is within the range of 10-1000
//
// * isValid(468); → should return true since 468 is within the range of 10-1000
//
// * isValid(1051); → should return false since 1051 is not within the range of 10-1000
//
//
// NOTE: All methods need to be defined as public static as we have been doing so far in the course.
//
// NOTE: Do not add a main method to the solution code.
