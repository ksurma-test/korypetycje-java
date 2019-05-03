package input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


   private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        for (int i=0 ; i<1 ; i++) {

            System.out.println("Podaj imie ");
            String firstName = scanner.next();
            System.out.println("Podaj nazwisko");
            String lastName = scanner.next();

            System.out.println("Podaj wzrost");

            Double height  = scanner.nextDouble();

            Person person = new Person(firstName , lastName, height );

            System.out.println("Czy użytkownik ma zwierze ");

            String hasPet = scanner.next();
            if (hasPet.equals("Tak")){
                System.out.println("Podaj nazwę zwierzęcia");
                String name = scanner.next();
                System.out.println("Podaj wiek zwierzęcia");
                int age  = scanner.nextInt();

                Pet pet = new Pet(name , age);

                person.setPet(pet);

            }



            list.add(person);

        }

        System.out.println(list);

        try (BufferedWriter bw  = new BufferedWriter(new FileWriter("Persons.txt"))) {

            bw.append(list.toString()).flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
