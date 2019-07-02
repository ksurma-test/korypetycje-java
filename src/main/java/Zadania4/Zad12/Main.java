package Zadania4.Zad12;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(isPalindrom("kajak"));

        List<String> lines = Files.readAllLines(Paths.get("plik.txt"));

        int count=0;

        for (String line : lines) {
            String[] words = line.split(" ");

            for (String word : words ) {
               if(isPalindrom(word)) {
                   count++;
               }
            }
        }

        System.out.println(count);
    }

    public static boolean isPalindrom(String word) {
        return  new StringBuilder(word).reverse().toString().equals(word);
    }

}
