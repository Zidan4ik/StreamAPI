package examples.stream;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {
        /*Terminal Operator*/

        String collect = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .map(Object::toString)
                .collect(Collectors.joining(" "));

        Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Optional<Integer> reduce1 = Stream.of(1, 6, 3).reduce((a, b) -> a + b);

        Integer reduce2 = Stream.of(1, 6, 3).reduce(10, (a, b) -> a * b);

        Integer reduce3 = Stream.of(1, 6, 3)
                .reduce(10, (identity, value) -> identity * value, (left, right) -> left + right);

        Optional<Integer> min = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).min((x, y) -> x - y);
        Optional<Integer> max = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).max((x, y) -> x - y);
        long count = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).count();
        boolean anyMatch = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).anyMatch(value -> value == 0);
        boolean allMatch = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).allMatch(value -> value > 0);
        boolean noneMatch = Stream.of(1, 7, 3, 1, 5, 91, 51, 13, -5).noneMatch(value -> value % 2 == 0);
        Optional<Integer> findFirst = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).parallel().findFirst();
        Optional<Integer> findAny = Stream.of(10, 6, 3, 1, 8, 92, 51, 12, 0, -5).parallel().findAny();

        System.out.println("Methods of terminal operators");
        System.out.println("Collect: " + collect);
        System.out.println("Reduce(identity): " + reduce1.get());
        System.out.println("Reduce(accumulator): " + reduce2);
        System.out.println("Reduce(combiner): " + reduce3);
        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
        System.out.println("Count: " + count);
        System.out.println("AnyMatch: " + anyMatch);
        System.out.println("AllMatch: " + allMatch);
        System.out.println("NoneMatch: " + noneMatch);
        System.out.println("FindFirst: " + findFirst.get());
        System.out.println("FindAny: " + findAny.get());

    }
}
