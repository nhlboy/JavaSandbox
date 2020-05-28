package Accidents;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Report {

    public static void main(String[] args) {

        Stream<Trucks> accidentsStream = Stream.of(new Trucks("Exel Logistics", "rollover", 47000),
                new Trucks("Ryder Transport", "jacknife", 14750),
                new Trucks("Highlight", "property damage", 21200));

        Stream<Trucks> accidentsStream2 = Stream.of(new Trucks("Exel Logistics", "rollover", 47000),
                new Trucks("Ryder Transport", "jacknife", 14750),
                new Trucks("Highlight", "property damage", 21200));

//        accidentsStream.filter(e -> e.getEstimate() < 100000).forEach(e -> System.out.println(e.getEstimate()));
            Stream.concat(accidentsStream, accidentsStream2).distinct().forEach(a -> System.out.println(a));

//        accidentsStream.map(e -> e.getEstimate()).forEach(e -> System.out.println(e));
        System.out.println("________________");
        ArrayList<Trucks> january = new ArrayList<Trucks>();
        january.add(new Trucks("King Transport", "PD non FATAL", 15000));
        january.add(new Trucks("GN Transport", "ditch", 33000));
        january.add(new Trucks("ABC", "rollover", 63500));

        ArrayList<Trucks> february = new ArrayList<Trucks>();
        february.add(new Trucks("EZ Transport", "burst", 98000));
        february.add(new Trucks("Sarai Logistics", "rollover", 117000));
        february.add(new Trucks("GGC", "property damaga at fault", 36500));

        System.out.println("________");

        Stream <List<Trucks>> listStream = Stream.of(january, february);
        listStream
                .flatMap(e -> e.stream())
                .sorted(new TrucksComparator())
                .skip(3)
                .limit(2)
                .forEach(e -> System.out.println(e.getEstimate()));

        Optional<Trucks> min = listStream.flatMap(e -> e.stream())
                .min(new TrucksComparator());
        System.out.println(min.get());
    }

}

class TrucksComparator implements Comparator<Trucks> {

    @Override
    public int compare(Trucks o1, Trucks o2) {
        return (int) (o2.getEstimate() - o1.getEstimate());
    }

}

class TruckComparatorCompanies implements Comparator <Trucks> {


    @Override
    public int compare(Trucks o1, Trucks o2) {
        return (o1.getCompanyName().toLowerCase().compareTo(o2.getCompanyName().toLowerCase()));

    }
}

class AccidentsComparator implements Comparator <Trucks> {

    @Override
    public int compare(Trucks o1, Trucks o2) {
        return (o1.getTypeOfAccident().toUpperCase().compareTo(o2.getTypeOfAccident().toUpperCase()));
    }
}