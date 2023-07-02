package br.com.student.entities;

public class Student {

    public String name;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;

    public double finalGrade(){
        return gradeOne + gradeTwo + gradeThree;
    }

    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

}
