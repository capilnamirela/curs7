package org.fasttrackit.won14.curs7.Homework7.exercise3;

public class Chicken implements AnimalBehavior {

    private static final String NAME_OF_ANIMAL = "CHICKEN";

    public Chicken() {
    }

    public String getNameOfAnimal(){
        return NAME_OF_ANIMAL;
    }

    public String animalWalk(){
        return "chicken-walking";
    }

    public String animalTalk(){
        return "chicken-talking";
    }

    public String animalEat(){
        return "chicken-eating";
    }




}

