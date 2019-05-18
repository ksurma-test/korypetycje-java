package pracadomowa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Iloraz1 {

    private static  int number1;
    private static  int number2;


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Podaj liczbę nr 1");
        number1 = scanner.nextInt();
        System.out.println("Podaj liczbę nr 2");
        number2 = scanner.nextInt();
        System.out.println("Wynik ilorazu");
        System.out.println(getIloraz());

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("wynik.txt"))) {
            bw.append(String.valueOf(getIloraz())).append("\r\n").flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // \r - od początku lini , \n - nowa linia
    }

    public static int getIloraz(){

        return number1/number2;

    }



}
