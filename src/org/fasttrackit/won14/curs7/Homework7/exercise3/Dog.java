package org.fasttrackit.won14.curs7.Homework7.exercise3;

public class Dog implements AnimalBehavior {

    private static final String NAME_OF_ANIMAL = "DOG";

    public Dog() {
    }

    public String getNameOfAnimal(){
        return NAME_OF_ANIMAL;
    }

    public String animalWalk(){
        return "dog-walking";
    }

    public String animalTalk(){
        return "dog-talking";
    }

    public String animalEat(){
        return "dog-eating";
    }




}
