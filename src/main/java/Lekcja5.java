import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lekcja5 {

    // podstawowa różnica jest taka że set sprawdza jeden raz jeden element bo  w secie nie ma duplikatów , set
    public static void main(String[] args) {

        List<Integer> intsList = List.of(1, 2, 3, 1, 2, 3);

        System.out.println(intsList.toString());

        if (intsList.contains(10)) { // złożoność 0 (n) , składa n operacji
            System.out.println("Lista zawiera liczbę 10");
        } else
            System.out.println("Nie zawiera 10");

//        Set<Integer> integerSet = Set.of(1, 2, 3, 1);

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        Set<Integer> integerSet1 = Set.of(1, 2, 3, 4);

        int[] integerArray = {1, 2, 3, 4, 5};

        int min1 = Collections.min(integerList);

        int min2 = integerList.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("min 2:" + min2);

        Arrays.stream(integerArray).min();

        Optional<String> optionalString = Optional.ofNullable(null);

        Person p1 = new Person("Adam", "Kowalski", 18);

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person("imie" + i,
                    "nazwisko" + i,
                    ThreadLocalRandom.current().nextInt(1,100)));
        }

//        for (Person p : personList) {
//
//            System.out.println(p);
//        }
        System.out.println("Wszyscy ludzie");
        personList.forEach(System.out::println);

        System.out.println("Ludzie pełnoletni");

        personList.stream().filter(person -> person.getAge() >= 18).forEach(System.out::println);

        System.out.println("Najmłodsza osoba");
        personList.stream().min(Person::compareTo).ifPresent(System.out::println);

        System.out.println("Najstarsza osoba");
        personList.stream().max(Person::compareTo).ifPresent(System.out::println);

        System.out.println("Posortowani rosnąco");
        personList.stream().sorted(Person::compareTo).forEach(System.out::println);

        System.out.println("Posortowani malejąco");
        personList.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);
    }

    // jeżeli porównujemy pierwszy z drugim to rosnąca  , gdy drugi z pierwszym to malejąca.



}