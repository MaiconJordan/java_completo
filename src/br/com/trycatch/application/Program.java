package br.com.trycatch.application;

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
        System.out.println("End Program");
        sc.close();
    }
}
