package practice;


import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && gender == person.gender;
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender);
    }

    @Override
    public String toString() {
        return
                "name=" + name  +
                ", surname=" + surname  +
                ", age=" + age +
                ", gender=" + gender;
    }
}
