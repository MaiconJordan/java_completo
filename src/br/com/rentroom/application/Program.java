package br.com.rentroom.application;

import br.com.rentroom.entities.Students;
import br.com.student.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Students[] rooms = new Students[10];

        System.out.println("Quantos alunos vão alugar os quartos? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
        System.out.println("Rent #" + i+ ": " );
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int roomNumber = sc.nextInt();

            Students student = new Students(name, email);

            rooms[roomNumber] = student;
        }

        for(int i = 0; i < rooms.length ; i++){
            if(rooms[i] != null){
                System.out.println(i +" "+ rooms[i]);
            }
        }


        sc.close();

    }
}
