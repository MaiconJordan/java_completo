package br.com.trycatch.application;

import br.com.trycatch.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramReservation {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room: ");
        int number = sc.nextInt();

        System.out.print("Check in: ");
        Date in = sdf.parse(sc.next());
        System.out.print("Check out: ");
        Date out = sdf.parse(sc.next());

        if(!out.after(in)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number,in,out);
            System.out.println(reservation);
        }



        sc.close();

    }
}
