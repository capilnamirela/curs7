package org.fasttrackit.won14.curs7.Homework7.exercise2;

public class Main {
    public static void main(String[] args) {
        ING bankAccount = new ING(1000);
        BT bankAccount1 = new BT(500);
        BRD bankAccount2 = new BRD(15000);

        Student myStudent = new Student("Ana", bankAccount);
        Student myStudent1 = new Student("George", bankAccount1);
        Student myStudent2 = new Student("Andreea", bankAccount2);

        System.out.print(myStudent.getStudentName() + " are cont deschis la: " + myStudent.getBankingProvider().getNameOfBank());
        System.out.println(" si are in cont: " + myStudent.getBankingProvider().getAvailableMoney());
        myStudent.getBankingProvider().depositMoney(500);
        System.out.println(myStudent.getBankingProvider().getAvailableMoney());
        myStudent.getBankingProvider().withdrawMoney(1700);
        System.out.println(myStudent.getBankingProvider().getAvailableMoney());

        System.out.print(myStudent1.getStudentName() + " are cont deschis la: " + myStudent1.getBankingProvider().getNameOfBank());
        System.out.println(" si are in cont: " + myStudent1.getBankingProvider().getAvailableMoney());
        myStudent1.getBankingProvider().depositMoney(500);
        System.out.println(myStudent1.getBankingProvider().getAvailableMoney());
        myStudent1.getBankingProvider().withdrawMoney(100);
        System.out.println(myStudent1.getBankingProvider().getAvailableMoney());

        System.out.print(myStudent2.getStudentName() + " are cont deschis la: " + myStudent2.getBankingProvider().getNameOfBank());
        System.out.println(" si are in cont: " + myStudent2.getBankingProvider().getAvailableMoney());
        myStudent2.getBankingProvider().depositMoney(5000);
        System.out.println(myStudent2.getBankingProvider().getAvailableMoney());
        myStudent2.getBankingProvider().withdrawMoney(1000);
        System.out.println(myStudent2.getBankingProvider().getAvailableMoney());

    }
}
