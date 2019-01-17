import javax.swing.text.html.parser.Parser;
import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println(endWith("Kamil Surma" , "ma"));
        System.out.println("Zadanie 2");
        System.out.println(firstHalf("Mój kot wabi się Tygrys"));
        System.out.println("Zadanie 3");
        System.out.println(countUpperCase("Kamil Surma"));
        System.out.println("Zadanie 4");
        System.out.println(remove("TekstX maX dziesiećX znaków" , 'X'));
        System.out.println("Zadanie 4 wersja  z Replace");
        System.out.println(removeWithReplace("TekstX maX pięćX znaków", 'X'));
        System.out.println("Zadanie 6");
        System.out.println(countSubstrings("helloalamakotahelloalamakotahello" , "hello"));
        System.out.println("Zadanie 6 wersja 2");
        System.out.println(countSubstrings2("hello alla , hello tomasz" , "hello"));
        System.out.println("Zadanie 7");
        System.out.println(isAnagram("kamil" , "limaa"));
        System.out.println("Zadanie 9");
        System.out.println(digitsInString("Kamil123"));
        System.out.println("Zadanie 10");
        System.out.println(length(1));

    }



    // Zadanie 1

public static boolean endWith(String s , String substring) {
       int sizeString =  s.length();
       int sizeSubstring= substring.length();
       return s.substring(sizeString - sizeSubstring).equals(substring);
}

// Zadanie 2
public static String firstHalf(String s) {
        int sizeString = s.length();
        int halfString = sizeString/2;
        String firstString = s.substring(0 ,halfString);
        return firstString;


}

   // Zadanie 3

    public static int countUpperCase(String s){
        int counter=0;
         for (char c: s.toCharArray()) {
             if(Character.isUpperCase(c)){
                 counter++;
                    //  counter += Character.isUpperCase(c) ? 1:0;
             }
         }

         return counter;
    }


        // Zadanie 4
    public static String remove(String str, char x){
        StringBuilder strBuilder = new StringBuilder();
        char[] rmString = str.toCharArray();
        for(int i=0; i<rmString.length; i++){
            if(rmString[i] == x){

            } else {
                strBuilder.append(rmString[i]);
            }
        }
        return strBuilder.toString();
    }

    // Zadanie 4 wersja z replace
    public static String removeWithReplace(String str, char x){
        String stringToReplace = Character.toString(x);
        return  str.replace(stringToReplace , "");

    }

//Zadanie 6
public static int countSubstrings(String s, String substring) {
        return s.split(substring).length;
}

    //Zadanie 6 wersja 2
public static int countSubstrings2(String s, String substring) {

int count =0;
int lastIndex =0;

    while (lastIndex !=-1 )
    {
    lastIndex = s.indexOf(substring , lastIndex);
    if(lastIndex != -1) {
        count++;
        lastIndex += substring.length();

    }
}return count;
    }

    // Zadanie 7

    public static boolean isAnagram(String s1 , String s2){

        if (s1.length() != s2.length()) {
            return false;
        }

        for(int i = 0; i < s2.length(); i++) {

            if( !s1.contains("" + s2.charAt(i))) {
                return false;
            }

            s1 = s1.replaceFirst("" + s2.charAt(i), "");
            s2 = s2.replaceFirst("" + s2.charAt(i), "");
        }
        return true;
    }

// Zadanie 9

public static int digitsInString(String s ) {
        char c;
        int value=1;
        for (int i=0 ; i < s.length() ; i++) {
            c = s.charAt(i);
            if(Character.isDigit(c))  {
                value *= Character.getNumericValue(c);
            }
        }
        return value;
    }

    // Zadanie 10

public static int length(int i) {
 int count=0;
  while (i!=0) {
      i/=10;
              count++;
  }

return count;
}

}



