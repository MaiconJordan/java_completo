package br.com.exercicio.application;

import br.com.exercicio.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner c = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of tirnagle X:");
        x.a = c.nextDouble();
        x.b = c.nextDouble();
        x.c = c.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = c.nextDouble();
        y.b = c.nextDouble();
        y.c = c.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);


        c.close();

    }

}
