package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

        public static void main(String[] args) throws Exception {

            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);

            String name1 = reader.readLine(); //читаем строку с клавиатуры
            String name2 = reader.readLine(); //читаем строку с клавиатуры
            String name3 = reader.readLine(); //читаем строку с клавиатуры

            System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

            String a1  = reader.readLine();
            String b1 = reader.readLine();
            String c1 = reader.readLine();

            int a = Integer.parseInt(a1); //переводим строку в число
            int b = Integer.parseInt(b1); //переводим строку в число
            int c = Integer.parseInt(c1); //переводим строку в число

            System.out.println(a + " + " + b + " + " + c);
        }


    }

// Ввести с клавиатуры три имени, вывести на экран надпись:
// name1 + name2 + name3 = Чистая любовь, да-да!
