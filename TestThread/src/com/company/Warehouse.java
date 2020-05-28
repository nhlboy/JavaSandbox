package com.company;

public class Warehouse {

    public static void main(String[] args) {

        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
// Класс Магазин, хранящий произведенные товары
class Store {
    private int product=0;
    public synchronized void get() {
        while (product<1) {
            //  если пришел поток, а товаров нет, принудительного усыпляем потом
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        // а сли товар есть, то вычиатем единцы продукта
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        // будим другой поток
        notify();
    }
    public synchronized void put() {
        // если склад забит, усыпляем поток
        while (product>=3) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}
// класс Производитель
class Producer implements Runnable{

    Store store;
    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
// Класс Потребитель
class Consumer implements Runnable{

    Store store;
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}