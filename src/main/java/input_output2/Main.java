package input_output2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private  static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Cart cart = new Cart("Koszyk");
        System.out.println("Ile produtow dodać do koszyka");
        int numberOfProducts  = scanner.nextInt();

        for (int i=0 ; i < numberOfProducts; i++ ){

            System.out.println("Podaj id produktu");
            int id = scanner.nextInt();
            System.out.println("Podaj nazwę produktu");
            String name = scanner.next();
            System.out.println("Podaj cenę");
            double price = scanner.nextDouble();

            Product product = new Product(id, name , price);
            cart.addProduct(product);
        }

        try (BufferedWriter bw  = new BufferedWriter(new FileWriter("Carts.txt", true))) {

            bw.append(cart.toString()).append("\r\n")
                    .flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
