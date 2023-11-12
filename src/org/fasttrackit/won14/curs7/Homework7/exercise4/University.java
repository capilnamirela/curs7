package org.fasttrackit.won14.curs7.Homework7.exercise4;

public class University {


    public static void main(String[] args) {
        Student student1 = new Student("Ana", 10);
        Student student2 = new Student("Alina", 8);
        Student student3 = new Student("Bogdan", 7);
        Student student4 = new Student("Mircea", 10);
        Student student5 = new Student("Andreea", 9);
        Student student6 = new Student("Cristina", 5);
        Student student7 = new Student("George", 8);
        Student student8 = new Student("Mihai", 9);

        System.out.println("Media notelor este: " + Student.averrage(Student.getSumOfGrades(), Student.getNrOfStudents()));

    }





}
