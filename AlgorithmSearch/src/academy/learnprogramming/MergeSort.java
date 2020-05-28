package academy.learnprogramming;

public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        // mergeSort(array, left, mid, right);
    }
}
