package org.fasttrackit.won14.curs7.Homework7.exercise2;

public class BT implements BankingProvider {
    private static final String NAME_OF_BANK = "BT";
    private Integer availableMoney;

    public BT(Integer availableMoney){
        this.availableMoney = availableMoney;
    }
    @Override
    public String getNameOfBank(){
        return NAME_OF_BANK;
    }

    @Override
    public Integer getAvailableMoney(){
        return availableMoney;
    }

    @Override
    public void depositMoney(Integer moneyToDeposit) {
        this.availableMoney += moneyToDeposit;
    }

    @Override
    public void withdrawMoney(Integer moneyToWithdraw) {
        if (this.availableMoney < moneyToWithdraw) {
            System.out.println("Fonduri insuficiente! Se poate retrage cel mult suma de: " + availableMoney);
        } else {
            this.availableMoney -= moneyToWithdraw;
        }
    }

}