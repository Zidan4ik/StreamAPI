package practice;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Roma", "Pravnyk", 20, Gender.man),
                new Person("Roma", "Pravnyk", 20, Gender.man),
                new Person("Denys", "Rock", 18, Gender.man),
                new Person("Katya", "Zaluzhna", 25, Gender.woman),
                new Person("Dima", "Grom", 32, Gender.man),
                new Person("Bohdan", "Kalytyn", 13, Gender.man),
                new Person("Olexiy", "Schipnyi", 6, Gender.man),
                new Person("Olexiy", "Schipnyi", 6, Gender.man),
                new Person("Ruslan", "Volodko", 64, Gender.man),
                new Person("Tanya", "Moroz", 17, Gender.woman),
                new Person("Tanya", "Moroz", 17, Gender.woman),
                new Person("Andriy", "Tulpan", 18, Gender.man),
                new Person("Roma", "Shevchenko", 107, Gender.man)
        );

// task 5.1

        Stream<Person> stream = persons.stream();
        Stream<Person> sort = persons.stream().sorted(((v1, v2) -> v1.getName().compareTo(v2.getName())));
        Stream<Person> filter = persons.stream().filter(v -> v.getAge() >= 25);
        Stream<Person> limit = persons.stream().limit(3);
        Stream<String> map = persons.stream().map(Person::getName);
        persons.stream().forEach(System.out::println);


//task 5.2
        boolean isLessThen18 = persons.stream().anyMatch(v -> v.getAge() < 18);
        boolean isBiggerThanOneSymbol = persons.stream().allMatch(v -> v.getName().length() > 1);
        boolean isAgeBiggerThan80 = persons.stream().noneMatch(v -> v.getAge() > 80);

        System.out.println(isLessThen18);
        System.out.println(isBiggerThanOneSymbol);
        System.out.println(isAgeBiggerThan80);

        Optional<Person> max = persons.stream()
                .max(((v1, v2) -> v2.getAge() - v1.getAge()));
        System.out.println(max.get());

        Optional<Person> min = persons.stream()
                .max(((v1, v2) -> v1.getAge() - v2.getAge()));
        System.out.println(min.get());

        long count = persons.stream()
                .filter(v -> v.getAge() == 18)
                .count();
        System.out.println("Кількість людей в колекції за віком 18: " + count);


        System.out.println();
        Map<Boolean, List<Person>> map2 = persons.stream()
                .collect(Collectors.partitioningBy(v -> v.getAge() >= 18));
        for (Map.Entry<Boolean, List<Person>> o : map2.entrySet()) {
            System.out.println("key: " + o.getKey() + " value: " + o.getValue());
        }


//task 5.3

//        v2 with override equals
//        persons.stream()
//                .distinct()
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        //v2 without override equals
        persons.stream()
                .map(person -> persons.stream()
                        .filter(person2 -> (person.getName().equals(person2.getName())
                                && person.getSurname().equals(person2.getSurname())
                                && person.getAge() == person2.getAge())
                                && person.getGender().equals(person2.getGender()))
                        .findFirst()
                        .orElse(null))
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
