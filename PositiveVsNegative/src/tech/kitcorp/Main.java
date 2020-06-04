package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sNumber = bufferedReader.readLine(); //читаем строку с клавиатуры
        int nNumber = Integer.parseInt(sNumber); //преобразовываем строку в число.

        if (nNumber > 0) {
            nNumber = (nNumber * 2);
            System.out.println(nNumber);
        } else if (nNumber < 0) {
            nNumber = nNumber + 1;
            System.out.println(nNumber);
        } else if (nNumber == 0) {
            System.out.println(0);
        }
    }
}

// Ввести с клавиатуры число.
// Если число положительное, то увеличить его в два раза.
// Если число отрицательное, то прибавить единицу.
// Если введенное число равно нулю, необходимо вывести ноль.
// Вывести результат на экран.