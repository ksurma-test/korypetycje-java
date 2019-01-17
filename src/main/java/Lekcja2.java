import java.util.*;

public class Lekcja2 {


    public static void main(String[] args) {

        int[] array = {1, 2};
        int n = 1;

        System.out.println(binarySearch(array, n));
        System.out.println(countSentences("Ala ma kota. Cos tam."));

        System.out.println(countVowels("Ala ma kota"));
    }

    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0 ; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static int countWords(String s) {
        return s.split(" ").length;
    }

    // 5 4 3 2 1 7
    // 7

    // 2 5 3 4 8 1 12 .. 10mln
    // 1

    // 1 3 5 6 7 8 10 11 .. 10mln
    // 3


    // 1 3 5 7 9 10 12 13 17 20 100 123 124 166
    // 7


    // 1 2
    public static boolean binarySearch(int[] array, int n) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        int centerIndex;

        while (leftIndex <= rightIndex) {
            centerIndex = (leftIndex + rightIndex) / 2;
            if (array[centerIndex] == n) {
                return true;
            } else if (n > array[centerIndex]) {
                leftIndex = centerIndex + 1;
            } else {
                rightIndex = centerIndex - 1;
            }
        }

        return false;
    }

    public static int countSentences(String text) {
        return text.split("\\.").length;
    }


    public void abc() {




        String text;            // 1
        text = "ala ma kota";   // 1 ala ma kota
        text += " cos tam";     // 1 ala ma kota cos tam
        text += " blabla";      // 1 ala ma kota cos tam blabla

        System.out.println(text);

        text = "costam";        // 1 costam
        // 2 costamcostam
        // 3 costamcostamcostam

        for (int i = 0; i < 10; i++) {
            text += "costam";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append("costam");
        }

        // 1 costamcostamcostamcostamcostamcostamcostamcostam 10 razy

        String s;
        for (int i = 0; i < 5; i++) {
            s = "abc";
        }


    }


    public static void set() {
        Set<String> values = new HashSet<>();
        values.add("dupa");
        values.add("costam");
        values.add("ma");
        values.add("kota");
        values.add("ala");

        // ("dupa", "costam", "ma", "kota", "ala")

        values.add("ala");

        // ("dupa", "costam", "ma", "kota", "ala")

        if (values.contains("ala")) {

        }

        List<String> list = new ArrayList<>();
        list.add("costam");
        list.add("ma");
        list.add("kota");
        list.add("ala");

        if (list.contains("ala")) {

        }

        String s = list.get(0);
    }

    // ala ma kota
    public static int countVowels(String text) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'A', 'i', 'I',
                'u', 'U', 'e', 'E', 'o', 'O'));
        int vowelsCount = 0;

        for (char c : text.toCharArray()) {
            if (vowels.contains(c)) {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }


}




