package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner challengeScanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10) {
        //while(true) {
            int order = counter + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = challengeScanner.hasNextInt();

            if(isAnInt) {
                int number = challengeScanner.nextInt();
                counter++;
                sum += number;
//                if(counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }

            challengeScanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Sum = " + sum);
        challengeScanner.close();
    }

}

//        -Read 10 numbers from the console entered by the user and print
//        the sum of those numbers.
//        -Create a Scanner like we did in the previous video.
//        -Use the hasNextInt() method from the scanner to check
//        if the user has entered an int value.
//        -If hasNextInt() returns false, print the message "Invalid Number".
//        Continue reading until you have read 10 numbers.
//        -Use the nextInt() method to get the number and add it to the sum.
//        -Before the user enters each number, print the message "Enter number #x:"
//        where x represents the count, i.e. 1, 2, 3, 4, etc.
//        -For example, the first message printed to the user would be ЃgEnter
//        number #1:Ѓh, the next ЃgEnter number #2: Ѓh, and so on.
//
//        Hint:
//        -Use a while loop.
//        -Use a counter variable for counting valid numbers.
//        -Close the scanner after you don't need it anymore.
//        -Create a project with the name ReadingUserInputChallenge.
