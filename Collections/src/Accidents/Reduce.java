package Accidents;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {

        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional<Integer> result = numbersStream.reduce((x, y)->x+y);
        System.out.println(result.get()); // 720

        System.out.println("----------");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        min.ifPresentOrElse(
          m -> System.out.println(m),
                () -> System.out.println("Not found")
        );

        if (min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
