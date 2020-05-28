package academy.learnprogramming;

public class RecursiveBinarySearch {

    public static int search (int array[], int firstIndex, int lastIndex, int serchIndex) {
        if(lastIndex >= firstIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex)/2;
        if (array[middleIndex] == serchIndex) {
            return array[middleIndex];
        }
        if(array[middleIndex] > serchIndex) {
            return search(array, firstIndex, middleIndex - 1, serchIndex);
        }
            if(array[middleIndex] < serchIndex) {
                return search(array, middleIndex + 1, lastIndex, serchIndex);
            }

        }
return -1;
    }
}
