package br.com.student.application;
import br.com.student.entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student  = new Student();

        student.name = sc.nextLine();
        student.gradeOne = sc.nextDouble();
        student.gradeTwo = sc.nextDouble();
        student.gradeThree = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
