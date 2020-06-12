package tech.kitcorp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        reverse(testArray);

//        reverse(new int[]{1, 2, 3, 4, 5});
    }

    public static void reverse(int[] myArray) {

        //System.out.println(Arrays.toString(myArray));
        for(int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + " ");
        }

        System.out.println();

        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}

//        -Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
//
//        Tip:
//        -Create a new console project with the name "ReverseArrayChallenge"