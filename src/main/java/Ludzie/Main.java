package Ludzie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę ludzi");
        int numberPerson = sc.nextInt();


        for (int i = 0; i < numberPerson; i++) {

            System.out.println("Podaj imie");

            String name = sc.next();

            System.out.println("Podaj nazwisko");

            String lastName = sc.next();

            System.out.println("Podaj wiek");

            int age = sc.nextInt();

            Person person = new Person(name, lastName,age);
            list.add(person);

            System.out.println(person);
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ludzie.txt"))){

            list.forEach(person -> {
                try {
                    bw.append(person.getName()).append(";")
                            .append(person.getLastName()).append(";")
                            .append(String.valueOf(person.getAge())).append("\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
