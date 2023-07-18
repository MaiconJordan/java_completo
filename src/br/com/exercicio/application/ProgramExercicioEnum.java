package br.com.exercicio.application;

import br.com.exercicio.entities.Departament;
import br.com.exercicio.entities.Worker;
import br.com.exercicio.entities.enums.WokerLevel;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicioEnum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter depatarment's name: ");
        String depatarmentName = sc.nextLine();
        System.out.print("Enter work data:");
        System.out.print("Name: ");
        String workerName= sc.nextLine();
        System.out.print("Worker Level: ");
        String workerLevel= sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary= sc.nextDouble();
        Worker worker = new Worker(workerName, WokerLevel.valueOf(workerLevel), baseSalary, new Departament(depatarmentName));





        sc.close();


    }
}
