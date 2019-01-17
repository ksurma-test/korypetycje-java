import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    // Ala ma kota

    // unsiged nie ma plus minus tylko zawsze plus w innych językach niż java



    public static int countChar(String str , char c) {
        int counter = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==c) {
                counter++;
            }

        }
        return counter;
    }

    public static void main(String[] args) {

        char c = 'A';
        c++;

        System.out.println(c);

        System.out.println((int) c);

        int[] array = new int[10];

        // indeksowanie w tablicy zawsze jest od zera 
        array[0] = 1;
        array[1] = 2;

        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < 10; i++) {
            array[i] = (i + 1) * 5;
        }


        String text = "Hello World";
        // dobrze
        if (text.equals("abc")) {


        }

        for (char b : text.toCharArray()) {
            System.out.println(b);
        }

        String imie = "Kamil";

        for (int i = 0; i < imie.length(); i++) {

            System.out.println(imie.charAt(i));
        }

        String str = "Ala ma kota";
        //  char c ="a";

        System.out.println("Ilość liter " + countChar("Ala ma kota", 'a'));
        if (str.contains("kot")) {

            System.out.println("Zawiera ciąg kot");
        } else {
            System.out.println("Nie zawiera ciągu kot");
        }

        str = "kot , kot , kot";


        int indexOfc = str.indexOf("c");
        System.out.println(indexOfc);
        System.out.println(str.lastIndexOf("kot"));


        String fileContents = "Ala ma kota, coś tam cos tam";
        String[] words = fileContents.split(" ");

// po lewej stronie to co się znajduje w środku po czym iterujemy
//
       for (String s : words) {
            System.out.println(s);
        }
        List<String> list = new ArrayList<String>();
        list.add("abc"); // 0
        list.add("def"); // indeks 1
        list.add("roz");
        list.remove(0); // remove("abc);
        System.out.println(list.get(0));
        String sentence  = "";
        System.out.println(sentence.isEmpty());
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // array[i]
        }

        for (String s : list)
            System.out.println(s);

        List<String> l = List.of("Ala" , "ma", "kota");

List<String> words2 = new ArrayList<>(Arrays.asList("Abc" , "abc" , "Kota", "a"));
// metoda zwracająca wyrazy dłuższe niz 3 znaki

        System.out.println(coutLongerThan(l, 2));
        System.out.println(countUpperCaseCharList(words2));
    }


    public static int coutLongerThan(List<String> list , int n) {
        int counter=0;
        for (String s: list) {
            if(s.length()>n){
                counter++;
            }
        }
return counter;
    }

    public static int countUpperCaseCharList(List<String> list){
        int counter=0;
        for (String s : list) {
            for (char c: s.toCharArray()) {
               if(Character.isUpperCase(c)){
                   counter++;
                 //  counter += Character.isUpperCase(c) ? 1:0;
               }
            }
        }return counter;
    }


}
