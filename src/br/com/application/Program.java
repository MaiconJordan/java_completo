package br.com.application;

import br.com.entities.Product;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner  sc = new Scanner(System.in);

        Product product = new Product();


        System.out.print("Enter product name: ");
        product.name = sc.nextLine();
        System.out.print("Enter product quantity: ");
        product.quantity = sc.nextInt();
        System.out.print("Enter product price: ");
        product.price = sc.nextDouble();

        double total = product.totalValueInStock();
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number products to be added in stock: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data: " + product);




        sc.close();
    }
}
