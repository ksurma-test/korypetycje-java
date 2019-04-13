import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Zadanie 1 ");
        System.out.println(countNumbersInFile("plik_stringowy.txt"));
        System.out.println(countNumberInFile_2("plik_stringowy.txt"));
        System.out.println("Zadanie 2");
        //System.out.println(decToBinary(26));
        //System.out.println(decToTro(26));
        decToTrenary();
        System.out.println("Zadanie 3");
        System.out.println(countZadanie_3());
        System.out.println("Zadanie 10");
        stringToBinary("Ala ma kota");
        System.out.println("countInspire");
        countInspire();
    }


    // Zadanie nr 1

    public static int countNumbersInFile(String file) throws IOException {
        String fileContents = new String(Files.readAllBytes(Paths.get(file)));
        Matcher matcher = Pattern.compile("[0-9]").matcher(fileContents);
        return (int) matcher.results().count();
    }


    public static int countNumberInFile_2(String file) throws IOException {
        String fileContets = new String(Files.readAllBytes(Paths.get(file)));
        int count = 0;
        for (char c : fileContets.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count;
    }

    public static String decToBinary(int n) {
        StringBuilder number = new StringBuilder();
        while (n > 0) {
            number.append(n%2);
            n/=2;
        }
        return number.reverse().toString();
    }


    public static String decToTro(int n) {
        StringBuilder number = new StringBuilder();
        while (n > 0) {
            number.append(n%3);
            n/=3;
        }
        return number.reverse().toString();
    }

    public static void decToTrenary() throws IOException {

        List<String> strings = Files.readAllLines(Paths.get("dziesietne.txt"));
        strings
                .stream()
                .map(s -> decToTro(Integer.parseInt(s)))
                .forEach(System.out::println);
    }

    public static int countZadanie_3() throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("trojkowy.txt"));
        return (int) strings.stream().filter(s -> s.endsWith("0")).count();
    }

// Zadanie 8

    public static int countAla(String file) throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(file));
        Pattern pattern = Pattern.compile("Ala");
      //  return (int)strings.stream().filter(s -> pattern.matcher(s).results().count() ==2).count();
        return (int) strings.stream().map(s -> pattern.matcher(s).results().count()).filter(l -> l==2).count();
    }

    // Zadanie 10
    public static void stringToBinary(String text) {
        for (char c : text.toCharArray()){
            System.out.println(decToBinary((int) c));
        }
    }


    public static void countInspire() {

        char c = 'A';

        System.out.println((int) c);
    }

}