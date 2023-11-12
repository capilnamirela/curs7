package org.fasttrackit.won14.curs7.Homework7.exercise3;

public class Mouse implements AnimalBehavior {

    private static final String NAME_OF_ANIMAL = "MOUSE";

    public Mouse() {
    }

    public String getNameOfAnimal(){
        return NAME_OF_ANIMAL;
    }

    public String animalWalk(){
        return "mouse-walking";
    }

    public String animalTalk(){
        return "mouse-talking";
    }

    public String animalEat(){
        return "mouse-eating";
    }




}

