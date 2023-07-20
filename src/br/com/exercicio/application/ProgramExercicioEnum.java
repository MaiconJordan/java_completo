package br.com.exercicio.application;

import br.com.exercicio.entities.Departament;
import br.com.exercicio.entities.HourContract;
import br.com.exercicio.entities.Worker;
import br.com.exercicio.entities.enums.WokerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicioEnum {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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

        System.out.println("How many contract to this worker?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter contract #" +i+ " data: ");
            System.out.print("Date(DD/MM/YYYY)");
            Date dateContract = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.println("Durations (hour): ");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(dateContract, valuePerHour, hour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring((3)));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for" + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));








        sc.close();


    }
}
