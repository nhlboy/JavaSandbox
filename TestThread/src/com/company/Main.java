package com.company;

public class Main {

    public static void main(String[] args) {
        Thread th = Thread.currentThread(); // получаем ссылку на текущий поток, который по умолчанию запущен при запуск PSVM
       // добавояем обработчик исключения, которое может вознкнуть
//        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                // когда возникнет исключение, мы выведем в консиль
//                System.out.println("Возникла ошибка: " + e.getMessage());
//            }
//        });
        System.out.println(2 / 0);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable runnable1 = () -> {

        };
    }
}