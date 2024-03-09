package examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediate {
    public static void main(String[] args) {
        /*Intermediate Operator*/

        Stream<Integer> filter = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .filter(i -> i <= 10);

        Stream<Integer> filter2 = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .filter(i -> i <= 10);

        Stream<Integer> sort = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .sorted((x, y) -> x - y);

        Stream<Integer> map = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .map(value -> value + 10);

        Stream<Integer> distinct = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .distinct();

        Stream<Integer> skip = Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5)
                .skip(5);

        IntStream mapToInt = Stream.of("1", "6", "3", "1", "8", "92", "51", "12", "0", "-5")
                .mapToInt(value -> Integer.parseInt(value));
        Set<Integer> peek = Stream.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
                .filter(v -> v >= 3)
                .peek(v -> System.out.print(v + " "))
                .collect(Collectors.toSet());

//        System.out.println("Intermediate Operator");
//        System.out.println("Main Collection for research: " + Stream.of(1, 6, 3, 1, 8, 92, 51, 12, 0, -5).collect(Collectors.toList()));
//        System.out.println("Filter: " + filter.collect(Collectors.toList()));
//        System.out.println("Sort: " + sort.collect(Collectors.toList()));
//        System.out.println("Map: " + map.collect(Collectors.toList()));
//        System.out.println("Distinct: " + distinct.collect(Collectors.toList()));
//        System.out.println("Skip: " + skip.collect(Collectors.toList()));
//        System.out.println("MapToInt: " + Arrays.toString(mapToInt.toArray()));


//      no use more than once instances type of Stream, as instance
//        Stream<Integer> stream = filter2.filter(x -> x >= 5);
//        List<Integer> collectFilter2 = filter2.collect(Collectors.toList());
//        System.out.println(collectFilter2);

    }
}
