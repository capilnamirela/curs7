package org.fasttrackit.won14.curs7.Homework7.exercise2;

public interface BankingProvider {
    String getNameOfBank();
    Integer getAvailableMoney();
    void depositMoney(Integer moneyToDeposit);
    void withdrawMoney(Integer moneyToWithdraw);
}
