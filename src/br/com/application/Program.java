package br.com.application;

import br.com.entities.Product;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);

        Product produto = new Product();


        System.out.println("Enter product name: ");
        produto.name = sc.nextLine();
        System.out.println("Enter product quantity: ");
        produto.quantity = sc.nextInt();
        System.out.println("Enter product price: ");
        produto.price = sc.nextDouble();

        double total = produto.totalValueInStock();

        System.out.println(produto);

        sc.close();
    }
}
