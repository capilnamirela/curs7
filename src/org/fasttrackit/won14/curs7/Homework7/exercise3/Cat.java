package org.fasttrackit.won14.curs7.Homework7.exercise3;

public class Cat implements AnimalBehavior {

    private static final String NAME_OF_ANIMAL = "CAT";

    public Cat() {
    }

    public String getNameOfAnimal(){
        return NAME_OF_ANIMAL;
    }

    public String animalWalk(){
        return "cat-walking";
    }

    public String animalTalk(){
        return "cat-talking";
    }

    public String animalEat(){
        return "cat-eating";
    }




}
