package org.fasttrackit.won14.curs7.code.interface2;

public class Main {
    public static void main(String[] args) {
        SomeAlgoritm someAlgoritm = new SomeAlgoritm(new HardCodedProvider());
        someAlgoritm.getStringsBiggerThan(2);

        SomeAlgoritm anotherAlgoritm = new SomeAlgoritm(new ScannerProvider(5));
        anotherAlgoritm.getStringsBiggerThan(5);


    }
}
