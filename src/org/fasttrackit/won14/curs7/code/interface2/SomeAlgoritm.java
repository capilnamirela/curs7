package org.fasttrackit.won14.curs7.code.interface2;

public class SomeAlgoritm {
    private DataProvider dataProvider;

    public SomeAlgoritm(DataProvider dataProvider){
        this.dataProvider = dataProvider;
    }

    public void getStringsBiggerThan(Integer biggerThan){
        for (String string : dataProvider.provideData()){
            if(string.length() > biggerThan){
                System.out.println(string);
            }
        }

    }
}
