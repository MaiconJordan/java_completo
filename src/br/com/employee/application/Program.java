package br.com.employee.application;

import br.com.employee.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be register? ");
        int n = sc.nextInt();


        List<Employee> list = new ArrayList<>();


        for(int i = 0; i <= n; i++){
            System.out.printf("Employee #", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double sal = sc.nextDouble();

            Employee emp = new Employee(id, name, sal);
            list.add(emp);

        }







        sc.close();

    }

}
