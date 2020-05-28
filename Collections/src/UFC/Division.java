package UFC;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Division {

    public static void main(String[] args) {
        Stream<Fighter> fightersStream = (Stream<Fighter>) Stream.of(
                new Fighter("Connor McGregor", "Light Weight", 155),
                new Fighter("Nate Diaz", "Lighte Weight", 155),
                new Fighter("Ronda Rousey", "Bunt Weight", 165),
                new Fighter("Alien Overeem", "Heavy Weight", 215),
                new Fighter("Jon Jones", "Heavy Weight", 212));


//      метод  Collectors.groupingBy()

        Map<String, List<Fighter>> fightersByDivision = fightersStream.collect(
                Collectors.groupingBy(Fighter::getDivision));

        for (Map.Entry<String, List<Fighter>> item : fightersByDivision.entrySet()) {

            System.out.println(item.getKey());
            for (Fighter fighter : item.getValue()) {

                System.out.println(fighter.getName());
            }
            System.out.println();
        }

//        Метод Collectors.partitioningBy
        Map<Boolean, List<Fighter>> fightersByDivision2 = fightersStream.collect(
                Collectors.partitioningBy(p->p.getDivision() == "Light"));

        for(Map.Entry<Boolean, List<Fighter>> item : fightersByDivision2.entrySet()){

            System.out.println(item.getKey());
            for(Fighter fighter : item.getValue()){

                System.out.println(fighter.getName());
            }
            System.out.println();
        }

//        Метод Coollectors.counting

        Map<String, Long> fightersByDivision3 = fightersStream.collect(
                Collectors.groupingBy(Fighter::getDivision, Collectors.counting()));

        for(Map.Entry<String, Long> item : fightersByDivision3.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }

//        Метод Collectors.summing

        Map<Integer, Integer> fightersByDivision4 = fightersStream.collect(
                Collectors.groupingBy(Fighter::getWeight, Collectors.summingInt(Fighter::getWeight)));

        for(Map.Entry<Integer, Integer> item : fightersByDivision4.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }

//        Методы maxBy и minBy

        Map<String, Optional<Fighter>> fightersByDivision5 = fightersStream.collect(
                Collectors.groupingBy(Fighter::getDivision,
                        Collectors.minBy(Comparator.comparing(Fighter::getWeight))));

        for(Map.Entry<String, Optional<Fighter>> item : fightersByDivision5.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
        }

    }
}

