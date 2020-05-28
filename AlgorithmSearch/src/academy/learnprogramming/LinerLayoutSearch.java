package academy.learnprogramming;

public class LinerLayoutSearch {
    public static int getLinerSearch(int array[], int x) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] == x) {
                return x;
            }
        }
        return -1;
    }
}
