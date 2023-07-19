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

        for (int i = 0; i <= n; i++){
            System.out.println("Enter contract #" +i+ " data: ");
            System.out.println("Date(DD/MM/YYYY)");
            Date dateContract = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.println("Durations (hour): ");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(dateContract, valuePerHour, hour);
            worker.addContract(contract);

        }






        sc.close();


    }
}
