import java.io.File;
import java.nio.file.Files;

public class Zadanie3 {


    public static void main(String[] args) {
        System.out.println("Zadanie 7");
        isFileEmpty("plik.txt");
    }


    // Zadanie 7
    public static void isFileEmpty(String filename) {
        File file = new File(filename);

        if (file.length() == 0) {
            System.out.printf("File is empty");
        } else {

            System.out.printf("File is not empty");
        }
    }


    // Zadanie 2

    public static String wordsFive() {

        String fileContents = new String(Files.readAllBytes("dane.txt"));



    }
}