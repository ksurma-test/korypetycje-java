import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie3 {


    public static void main(String[] args) throws IOException {
        System.out.println("Zadanie 7");
        isFileEmpty("plik.txt");
        System.out.println("Zadanie 5");
        System.out.println(countWordsLongerThan5());
        System.out.println("Zadanie 5_2 ");
        System.out.println(countWordsLongerThan5_2());
        System.out.println("Zadanie 3");
        System.out.println(isWordJavaInFile());
        System.out.println("Zadanie 4");
        System.out.println(sumNumbers());
        System.out.println("Zadanie 5");
        System.out.println(countEvens());
        System.out.println("Zadanie5 _2 ");
        System.out.println(countEvens_2());
        System.out.println("Zadanie 6");
        System.out.println(binToDec("0110"));
        System.out.println(numberBeetwen100and100());
    }


    // Zadanie 7
    public static void isFileEmpty(String filename) {
        File file = new File(filename);

        if (file.length() == 0) {
            System.out.println("File is empty");
        } else {

            System.out.println("File is not empty");
        }
    }


    // Zadanie 2

    public static int countWordsLongerThan5() {

int counter =0;
        String fileContents = null;
        try {
            fileContents = new String(Files.readAllBytes(Paths.get("dane.txt")));
           Matcher matcher = Pattern.compile("\\w+").matcher(fileContents) ;
            String word;
           while (matcher.find()){
               word = matcher.group();
               if (word.length() > 5 ){

                   counter++;
               }
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;



    }

    public static int countWordsLongerThan5_2() throws  IOException{
        String fileContents = new String(Files.readAllBytes(Paths.get("dane.txt")));
        Matcher matcher = Pattern.compile("\\w+").matcher(fileContents);
        return (int) matcher.results()
                .filter(r -> r.group().length() > 5)
                .count();
    }


    public static boolean isWordJavaInFile() throws  IOException{
        String fileContents = new String(Files.readAllBytes(Paths.get("dane.txt")));
        Matcher matcher = Pattern.compile("java").matcher(fileContents);
        return matcher.find();
    }


    public static double sumNumbers() throws IOException {
        String fileContents = new String(Files.readAllBytes(Paths.get("liczby_zmienno_przecinkowe.txt")));
        String[] data =  fileContents.split(" ");

        double sum =0;

        for (String s : data ) {
           sum += Double.parseDouble(s);
        }

        return sum;
    }

    public static int countEvens() throws IOException {
        int count=0;
        List<String> strings = Files.readAllLines(Paths.get("binary.txt"));

        for (String s : strings) {
            if(s.endsWith("0")){
                count++;
            }
        }

        return count;
    }

    public static int countEvens_2() throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("binary.txt"));
       return (int) strings.stream().filter(s -> s.endsWith("0")).count();
    }

    public static int binToDec(String bin){
        int sum = 0;
        for (int i = 0; i < bin.length(); i++) {
            sum +=Character.getNumericValue(bin.charAt(bin.length() -1 -i)) * Math.pow(2,i);
//            sum += (bin.charAt(bin.length() -1 -i ) == '0' ? 0:1 ) * Math.pow(2, i);
        }
        return sum;
    }

    public static int numberBeetwen100and100() throws IOException {
        List<String> strings = Files.readAllLines(Paths.get("binary.txt"));
         return  (int) strings.stream().map(Zadanie3::binToDec).filter(s -> s> 100 && s< 1000).count();

    }



}
