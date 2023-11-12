package org.fasttrackit.won14.curs7.Homework7.exercise1;

public class EmailAdv implements AdvPlatform {
    private static final String NAME_OF_PLATFORM = "E-mail";
    private Integer priceCharacter;

    public EmailAdv (Integer priceCharacter){
        this.priceCharacter = priceCharacter;
    }

    public String getNameOfPlatform() {
        return NAME_OF_PLATFORM;
    }

    public Integer getPriceCharacter() {
        return priceCharacter;
    }

    public Integer priceAdd(String textAdd) {
        Integer nrCharacters = textAdd.length();
        Integer totalPrice = this.priceCharacter * nrCharacters;
        return totalPrice;
    }
}
