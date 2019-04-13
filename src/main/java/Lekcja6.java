import pets.Cat;
import pets.Pet;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lekcja6 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,10,-12, -22);

        System.out.println(list);

// reverse order mówimy tylko o int kolejność malejąca
        list =  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(list);

        List<Pet> pets  = List.of(
                new Pet("Zwierze1" , 10.5 , 5),
                new Pet ("Zwierze2" , 20.5 , 10),
                new Pet ("Zwierze3" , 14.5 , 2)
        );
        System.out.println(pets);
        System.out.println(pets.stream().sorted().collect(Collectors.toList()));


        Cat cat = new Cat("zwierze - kot" , 1.4 , 1);
        if (cat.isObese()) {
            System.out.println("kot jest otyły");
        } else {
            System.out.println("kot nie jest otyły");
        }


        Pet pet  = new Cat("zwierze-kot-1" , 1.5 , 1);
        if (((Cat) pet).isObese()) {
            System.out.println("Zwierze-kot jest otyly");
        } else {
            System.out.println("Kot zwierze nie jest otyły");
        }
// Zwraca clasCastExeption

//        Cat cat2  = (Cat) new Pet ("kot-zwierze-1" , 1.5 , 1 );
//
//        if (cat2.isObese()) {
//
//            System.out.println("kot-zwierze jest otyły");
//        } else {
//            System.out.println("kot zwierze nie jest otyły");
//        }
    }
}
