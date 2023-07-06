package br.com.exercise.arrays.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            int x = 0;
            System.out.print("enter the number: ");
            x = sc.nextInt();
            vect[i] = x;
        }

        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println("Negative numbers:");
                System.out.println(vect[i]);
            }
        }






        sc.close();
    }
}
