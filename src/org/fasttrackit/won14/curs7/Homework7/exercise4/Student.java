package org.fasttrackit.won14.curs7.Homework7.exercise4;

public class Student {
    private String studentName;
    private double studentGrade;
    private static double sumOfGrades = 0;
    private static int nrOfStudents = 0;


    public Student (String studentName, double studentGrade){
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        sumOfGrades += studentGrade;
        nrOfStudents += 1;
    }

    public String getStudentName() {
        return this.studentName;
    }
    public double getStudentGrade() {
        return this.studentGrade;
    }
    public static double getSumOfGrades() {
        return sumOfGrades;
    }

    public static int getNrOfStudents() {
        return nrOfStudents;
    }
    public static double averrage (double sumOfGrades, int nrOfStudents){
        double calculatedAverrage = sumOfGrades/nrOfStudents;
        return calculatedAverrage;
    }

}
