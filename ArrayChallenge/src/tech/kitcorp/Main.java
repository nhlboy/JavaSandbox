package tech.kitcorp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        getIntegers();
        printArray();
        sortIntegers();
//
    }

    static int[] myArray = new int[5];

    public static void getIntegers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
        }
    }

    public static void printArray() {
        System.out.println("Original array is: " + Arrays.toString(myArray));
    }


    public static void sortIntegers() {
//        Arrays.sort(myArray, Collections.reverseOrder());
        Arrays.sort(myArray);
        System.out.print("Sorted array in descending order: ");
        System.out.print("[");
        for (int j = 4; j >= 0; j--) {


            System.out.print(myArray[j]);
            System.out.print(" ");
//            System.out.println("Sorted array in descending order: " + Arrays.toString(myArray));

        }
        System.out.print("]");
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