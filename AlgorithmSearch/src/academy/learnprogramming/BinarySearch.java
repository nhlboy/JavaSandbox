package academy.learnprogramming;

public class BinarySearch {
    public static int getBinarySearch (int M[], int x) {
        int firstIndex = 0;
        int lastIndex = M.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (M[middleIndex] == x) {
                System.out.println(M[middleIndex]);
                return middleIndex;

            }
            else if (M[middleIndex] < x) {
                System.out.println(M[middleIndex]);
                firstIndex = middleIndex +1;

            }
            else if (M[middleIndex] > x) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;

    }
}
