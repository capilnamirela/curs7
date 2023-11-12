package org.fasttrackit.won14.curs7.Homework7.exercise3;

public class Duck implements AnimalBehavior {

    private static final String NAME_OF_ANIMAL = "DUCK";

    public Duck() {
    }

    public String getNameOfAnimal(){
        return NAME_OF_ANIMAL;
    }

    public String animalWalk(){
        return "duck-walking";
    }

    public String animalTalk(){
        return "duck-talking";
    }

    public String animalEat(){
        return "duck-eating";
    }




}
