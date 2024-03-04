package examples.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreating {
    public static void main(String[] args) {
        List<Integer> listIntegers = new ArrayList<>();
        Map<String, Integer> mapIntegers = new HashMap<>();
        Object[] array = new Object[0];

        Stream<Integer> listStream = listIntegers.stream();
        Stream<Map.Entry<String, Integer>> entryStream = mapIntegers.entrySet().stream();
        Stream<Object> arrayStream = Arrays.stream(array);
        Stream<Object> emptyStream = Stream.empty();
        Stream<Object> stream = Stream.of(1, "1", listIntegers, listStream, null);
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

        // infinite streams
        Stream<String> generate = Stream.generate(() -> "f5");
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        System.out.print("Stream from method generate: ");
        generate.limit(1).forEach(System.out::println);
        System.out.print("Stream from StreamBuilder: ");
        streamBuilder.collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        System.out.print("Stream from method iterated: ");
        List<Integer> collect = streamIterated.collect(Collectors.toList());
        System.out.println(collect);

    }
}
