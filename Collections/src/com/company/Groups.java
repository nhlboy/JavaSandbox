package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Groups {
    public static void main(String[] args) {

        Cat cat = new Cat("Terminator", 15, 10);

        Stream<Cat> streamCat = Stream.of(new Cat("Terminator2", 20, 44), new Cat("Terminator2", 20, 44), new Cat("Vasya", 10, 13), new Cat("Alien", 75, 3));

//        Map<Integer, List<Cat>> catCollection = streamCat.collect(Collectors.groupingBy(Cat::getWeight));
//        Map<Boolean, List<Cat>> catCollection = streamCat.collect(Collectors.partitioningBy(cat2 -> cat2.getWeight() > 20));
        Map<String, Long> catCounting = streamCat.collect(Collectors.groupingBy(Cat::getName, Collectors.counting()));
        // entrySet набор пар ключ-значение
        // Map.entry - пара ключ-значение
        for(Map.Entry<String, Long> catItem : catCounting.entrySet()) {
            System.out.println(catItem.getKey());
            System.out.println(catItem.getValue());
        }

    }
}
