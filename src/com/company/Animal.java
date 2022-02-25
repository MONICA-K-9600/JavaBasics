package com.company;

public class Animal {//polymorphism

public void AnimalSound(){
    System.out.println("Animals Sound:Using Polymorphism");
    }

    static class Pig extends Animal {
        public void AnimalSound() {
            System.out.println("Pig");
        }
    }
    static class Dog extends Animal{
        public void AnimalSound(){
            System.out.println("Dog");
    }}


}
