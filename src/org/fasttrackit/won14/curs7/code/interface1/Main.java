package org.fasttrackit.won14.curs7.code.interface1;

public class Main {
    public static void main(String[] args) {
        KFC kfcOrder = new KFC(4);
        McDonalds msDonaldsOrder = new McDonalds(6);

        Company myCompany = new Company("Apple", kfcOrder );
        Company anotherCompany = new Company("Facebook", msDonaldsOrder );

        myCompany.getFoodProvider().addMoreQuantity(5);
        anotherCompany.getFoodProvider().addMoreQuantity(2);

        System.out.println(myCompany.getFoodProvider().getName());


         }
}

