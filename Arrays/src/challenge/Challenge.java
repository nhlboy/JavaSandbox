package challenge;

import java.util.Scanner;

public class Challenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int[] challengeIntegers = getIntegers(5);
        int[] sortedChalengeIntegers =

        for (int i = 0; i < challengeIntegers.length; i++) {
            System.out.println("Element " + i + " = " + challengeIntegers[i]);

            System.out.println(getIntegers(5));

        }


    }


    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void bubbleSort ( int[] array){
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
    }


// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.

// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.


// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
