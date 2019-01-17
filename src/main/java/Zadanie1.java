import java.lang.reflect.Array;
import java.util.*;

public class Zadanie1 {

    public static void main(String[] args) {

        // Zadanie 1

        System.out.println("Zadanie 1");
        System.out.println(reverseString("Kamil"));
        System.out.println(reverseString2("Jan"));

        // Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println(countWords("Kamil Surma"));

        // Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println(isInOrder(new int[]{5,4,3,2,1,1}));

        //Zadanie 4
        System.out.println("Zadanie 4");
        contains(new int[]{123,22,33,44} , 4);


        //Zadanie 5
        System.out.println("Zadanie 5");
        System.out.println(lognestWord("Ostanio w kinie oglądaliśmy bardzo dobrą komedię"));
        System.out.println(max(new int[]{1,2,67,100,2,-2}));
        System.out.println(minForEach(new int[]{50,60,33,-22,100}  ));
        System.out.println(lognestWord("Ala ma pięknego psa i krokodyla"));
        System.out.println(countSentences("To ja. Kamil się nazwyam. Mieszkam w Warszawie."));
        System.out.println("Zadanie 9");
        System.out.println(sumDigits("Kamil123"));
        System.out.println("Zadanie 7");
        System.out.println(maxCharInString("Kamil aaa ma eeeeeeeee"));
        System.out.println("Zadanie 10");
        System.out.println(sameEnds("AAAKamil" , "Kamila" , 3));

    }


// Zadanie 1

    private static String reverseString(String s) {

        return new StringBuilder(s).reverse().toString();
    }

    private static String reverseString2(String s) {
        StringBuilder sb  = new StringBuilder();
        for (int i = s.length() -1 ; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

// Zadanie 2

    private static int countWords(String s) {

        return s.split(" ").length;
    }

// Zadanie 3

    public static boolean isInOrder(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println(numbers[i]);
            if (numbers[i] < numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }

    //Zadanie 4

    public static boolean contains(int[] array, int n){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==n){
                return true;
            }
        }

        return false;
    }

    public  static boolean binarySearch(int[] array, int n ) {
        int leftIndex = 0;
        int rightIndex = array.length;
        int centerIndex;

        while (leftIndex <= rightIndex) {
            centerIndex = (leftIndex + rightIndex) /2 ;
            if (array[centerIndex] == n) {
                return true;
            } else if (n > array[centerIndex]){
                leftIndex = centerIndex +1;
            } else {
                rightIndex = centerIndex -1;
            }
        }
        return false;
    }


    //Zdanie 5
    public static String lognestWord(String s) {
     String maxCiag =  Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
    return maxCiag;
    }

//    public  static String tlongestWord2(String s) {
//
//    }

    public static int max (int[] array) {
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max)
                max = array[i];
        }

        return max;
    }

    // Zadanie 7

    public static char maxCharInString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        char c= ' ';
        int repetitions = 0;

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > repetitions) {

                repetitions = e.getValue();
                c = e.getKey();
            }
        }
        return c;
    }



    // Zadanie 9

    public static int sumDigits(String s ) {
        char c;
        int value=0;
        for (int i=0 ; i < s.length() ; i++) {
            c = s.charAt(i);
            if(Character.isDigit(c))  {
                value += Character.getNumericValue(c);
            }
        }
        return value;
    }


    // Zadanie 10
    public static boolean sameEnds(String a , String b , int lenght) {
        return a.substring(a.length() -1 - lenght).equals(b.substring(b.length()-1 - lenght));
    }

    public static int minFori (int[] array) {
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]< min)
                min = array[i];
        }

        return min;
    }

    public static String longestWord(String str) {
        String[] words  = str.split(" ");
        String longestWord=words[0];

        for (String s : words) {
            if (s.length() > longestWord.length()) {
                longestWord = s;
            }
        }

        return longestWord;
    }

    public static int countSentences(String s) {

        return s.split("\\.").length;


    }

    public static int minForEach (int[] array) {
        int min=array[0];
        for (int i : array) {
            if (i< min)
                min = i;
        }
        return min;
    }

    public static void set() {

        Set<String> values  = new HashSet<>();
    }
    public static int sumDigits(int i ) {
        int suma = 0;
        while (i>0){

            suma+=i % 10;
            i /= 10;
        }

        return suma;

    }



}
