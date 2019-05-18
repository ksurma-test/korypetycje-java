package pracadomowa;

import java.io.*;
import java.util.Scanner;

public class IloczynLiczb {

    public static void main(String[] args) {

        System.out.println("Wpisz nazwę pliku");

        Scanner scanner = new Scanner(System.in);
        String file = scanner.next();

        int iloczyn = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(line.toCharArray()[i])) {
                        iloczyn *= Character.getNumericValue(line.toCharArray()[i]);
                    }

                }

            }

        } catch (IOException fi) {
            fi.printStackTrace();
        }

        System.out.println(iloczyn);


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("wynikiloczyn.txt"))) {

            bw.append(String.valueOf(iloczyn)).append("\r\n").flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}