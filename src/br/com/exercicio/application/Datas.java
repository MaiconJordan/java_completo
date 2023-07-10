package br.com.exercicio.application;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Datas {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        LocalDate d03 = LocalDate.parse("2023-07-10");

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);

    }
}
