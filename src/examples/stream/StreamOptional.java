package examples.stream;

import java.util.Optional;

public class StreamOptional {
    public static void main(String[] args) {
        String[] str = new String[]{"1", null, "3", "4", "5"};

        Optional<String> optional = Optional.empty();
        System.out.println(optional);

        Optional<String> optional1 = Optional.ofNullable(str[1]);
        Optional<String> optional2 = Optional.ofNullable(str[2]);

        System.out.println(optional1.isEmpty());
        System.out.println(optional2.isEmpty());

        System.out.println(optional1);
        System.out.println(optional2.get());

//        Optional<String> optional3 = Optional.of(str[1]);
//        Optional<String> optional4 = Optional.of(str[2]);

    }
}
