package countchar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int counter=0;


        String line ;
        try(BufferedReader br  = new BufferedReader(new FileReader("1.txt"))){

            while ((line = br.readLine()) != null) {

                for (char c : line.toCharArray()) {
                    if(Character.isLetter(c)) {
                        counter++;
                    }
                }
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(counter);

    }

}

