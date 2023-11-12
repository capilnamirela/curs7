package org.fasttrackit.won14.curs7.Homework7.exercise2;

public class Student {
    private String studentName;
    private BankingProvider bankingProvider;

    public Student (String studentName, BankingProvider bankingProvider){
        this.studentName = studentName;
        this.bankingProvider = bankingProvider;
    }

    public String getStudentName(){
        return studentName;
    }
    public BankingProvider getBankingProvider(){
        return bankingProvider;
    }

}
