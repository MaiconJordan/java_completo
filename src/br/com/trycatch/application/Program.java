package br.com.trycatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Position not exist");
        }
        catch (InputMismatchException e){
            System.out.println("input error");
        }
        System.out.println("End Program");
        sc.close();
    }
}
