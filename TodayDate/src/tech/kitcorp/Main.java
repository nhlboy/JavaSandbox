package tech.kitcorp;

/*
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
    }
}

//Вывести на экран текущую дату в аналогичном виде "21 02 2014".