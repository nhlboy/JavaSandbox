package academy.learnprogramming;

public class InsertSearch {

    public static void main(String[] args) {

        int newArray [] = {1, 4, 5, 3};
        int newCurrent;

        for (int a = 1; a < newArray.length; a++) {
            newCurrent = newArray[a];
            int b = a - 1;
            while(b >= 0 && newCurrent < newArray[b]) {
                newArray[b + 1] = newArray [b];
                b--;
            }
            newArray [b + 1] = newCurrent;
        }
    }

    public static void insertionSort(int[] array) {


        //InsertSearch.insertionSort(new int []{8, 4, 6});

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
           // переменная j будет указаывать на предыдущий элемент
            int j = i - 1;
            // проверяем, что текущий элемент меньше, чем предыдущий
            while(j >= 0 && current < array[j]) {
               // меняем местами
                array[j+1] = array[j];
                // откатываем на шаг назад, чтобы еще раз сравнить элементы массива
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
        }
    }
}
