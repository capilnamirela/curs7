package org.fasttrackit.won14.curs7.code.interface1;

public class McDonalds implements FoodProvider{
    private static final String NAME_OF_PROVIDER = "McDonalds";
    private int quantityNeeded;
    private Integer bonusPoints = 0;

    public McDonalds(Integer quantityNeeded){
        this.quantityNeeded = quantityNeeded;
        bonusPoints += 4;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer numberOfEmployees() {
        return 0;
    }

    @Override
    public Integer quantityNeededForDelivery() {
        return quantityNeeded;
    }

    public void addMoreQuantity(Integer extraQuantity) {
        this.quantityNeeded += extraQuantity;
        System.out.println("Thank you for your order. Because of your extra order you receive 4 more points");
        this.bonusPoints += 4;
    }

}
