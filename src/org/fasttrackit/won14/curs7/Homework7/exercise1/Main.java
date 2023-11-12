package org.fasttrackit.won14.curs7.Homework7.exercise1;

public class Main {
    public static void main(String[] args) {
       FacebookAdv facebookAD = new FacebookAdv(2);
       EmailAdv emailAD = new EmailAdv(1);
       PrintAdv printAD = new PrintAdv(3);


        String textAdd = "Reduceri mari - Black Friday!";

        Company myCompany = new Company("Apple", facebookAD);
        System.out.println("Pretul pentru reclama pe " + myCompany.getAdvProvider().getNameOfPlatform() + " este: " + myCompany.getAdvProvider().priceAdd(textAdd));

        Company myCompany1 = new Company("Microsoft", emailAD);
        System.out.println("Pretul pentru reclama pe " + myCompany1.getAdvProvider().getNameOfPlatform() + " este: " + myCompany1.getAdvProvider().priceAdd(textAdd));

        Company myCompany2 = new Company("Google", printAD);
        System.out.println("Pretul pentru reclama pe " + myCompany2.getAdvProvider().getNameOfPlatform() + " este: " + myCompany2.getAdvProvider().priceAdd(textAdd));

    }
}
