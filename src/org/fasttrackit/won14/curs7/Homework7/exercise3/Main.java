package org.fasttrackit.won14.curs7.Homework7.exercise3;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Mouse myMouse = new Mouse();
        Chicken myChicken = new Chicken();
        Duck myDuck = new Duck();

        Animal myAnimal = new Animal(myCat);
        System.out.println(myAnimal.getAnimalBehavior().animalWalk());
        System.out.println(myAnimal.getAnimalBehavior().animalTalk());
        System.out.println(myAnimal.getAnimalBehavior().animalEat());

        Animal myAnimal1 = new Animal(myDog);
        System.out.println(myAnimal1.getAnimalBehavior().animalWalk());
        System.out.println(myAnimal1.getAnimalBehavior().animalTalk());
        System.out.println(myAnimal1.getAnimalBehavior().animalEat());

        Animal myAnimal2 = new Animal(myMouse);
        System.out.println(myAnimal2.getAnimalBehavior().animalWalk());
        System.out.println(myAnimal2.getAnimalBehavior().animalTalk());
        System.out.println(myAnimal2.getAnimalBehavior().animalEat());

        Animal myAnimal3 = new Animal(myChicken);
        System.out.println(myAnimal3.getAnimalBehavior().animalWalk());
        System.out.println(myAnimal3.getAnimalBehavior().animalTalk());
        System.out.println(myAnimal3.getAnimalBehavior().animalEat());

        Animal myAnimal4 = new Animal(myDuck);
        System.out.println(myAnimal4.getAnimalBehavior().animalWalk());
        System.out.println(myAnimal4.getAnimalBehavior().animalTalk());
        System.out.println(myAnimal4.getAnimalBehavior().animalEat());
    }
}
