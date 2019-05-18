package PeopleUnder35;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String line;
        String[] data;

        try (BufferedReader br = new BufferedReader(new FileReader("ludzie.txt"))){

            while ((line = br.readLine()) != null){
                data = line.split(";");
                if(Integer.parseInt(data[2]) > 35 ){

                    System.out.println(data[0] + " " + data[1]);
                }



            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
