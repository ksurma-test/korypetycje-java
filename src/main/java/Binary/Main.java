package Binary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        boolean isBinary= true;


        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("1.txt"))) {

            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (c != '0' && c != '1') {
                        isBinary=false;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(isBinary){
            System.out.println("Plik jest binarny");
        }else {
            System.out.println("Plik nie jest binarny");
        }
    }

}