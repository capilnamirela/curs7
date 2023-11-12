package org.fasttrackit.won14.curs7.Homework7.exercise1;

public class Company {
    private String companyName;
    private AdvPlatform advProvider;

    public Company(String companyName, AdvPlatform advProvider) {
        this.companyName = companyName;
        this.advProvider = advProvider;
    }

    public String getCompanyName() {
        return companyName;
    }

    public AdvPlatform getAdvProvider() {
        return advProvider;
    }


}
