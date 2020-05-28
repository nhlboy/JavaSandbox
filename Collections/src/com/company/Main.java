package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat("Vaska", 30, 10);
        catArray[1] = new Cat("Barsik", 45, 14);
        catArray[2] = new Cat("Termanator", 75, 3);

        try {
            catArray[3] = new Cat("T-1000", 75, 3);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        for(Cat cat : catArray) {
            System.out.println(cat.getName());
        }

        System.out.println("_______________");

        ArrayList<Cat> catArrayList = new ArrayList<Cat>(3);
        catArrayList.add(new Cat("Vaska", 30, 10));
        catArrayList.add(new Cat("Barsik", 45, 14));
        catArrayList.add(new Cat("Termanator", 75, 3));
        catArrayList.set(0, new Cat("T-1000", 75, 10));
        for(Cat cat :catArrayList) {
            System.out.println(cat.getName());
        }
        System.out.println(catArrayList.stream().count()); // выведет количесвто жлемнетов в масиве
        catArrayList.stream().filter(c -> c.getAge() > 9).forEach(c -> System.out.println(c.getName() + "!!!!"));
//        System.out.println(catArrayList.get(3).getName());

        Cat cat1 = new Cat("Neo", 50, 10);
        Cat cat2 = new Cat("Trinity", 45, 11);
        Cat cat3 = new Cat("Agent Smith", 60, 45);

        ArrayList<Cat> catArrayListNew = new ArrayList<Cat>(2);
        catArrayListNew.add(cat1);
        catArrayListNew.add(cat2);
        catArrayListNew.add(cat3);
        catArrayListNew.add(cat3);

        catArrayListNew.remove(0); // удаление по индексу
        catArrayListNew.remove(cat3); //  удаление по значению

//        catArrayListNew.set(1, cat2);



        for(Cat cat :catArrayListNew) {
            System.out.println(cat.getAge());
        }

        HashSet<Cat> hashSet = new HashSet<Cat>();
        hashSet.add(cat1);
        hashSet.add(cat2);
        hashSet.add(cat3);
        hashSet.add(cat3);

        for(Cat cat : hashSet) {
            System.out.println(cat.getName());
        }

        System.out.println("********");

        HashMap<String, Cat> hashMapCat = new HashMap<>();
        hashMapCat.put(null, cat1);
        hashMapCat.put("Red Key", cat2);
        hashMapCat.put("White Key", cat3);


        for(Map.Entry<String, Cat> item : hashMapCat.entrySet()) {
            System.out.print(item.getKey() + ": ");
            System.out.println(item.getValue().getName());
        }

        Animal animal = new Animal() {
            @Override
            public String voice(String s) {
                return s;
            }
        };

        Animal animal1 = (s) -> {
            return s;
        };
        System.out.println(animal.voice("Bark"));
        System.out.println(animal1.voice("Bark 2"));


    }
    }
