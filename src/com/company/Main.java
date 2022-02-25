package com.company;

import java.lang.reflect.Array;
import java.sql.SQLOutput;


public class Main {

    public static void main(String[] args) {

        ConditionalOperators conditionalOperators=new ConditionalOperators();

        conditionalOperators.dayCount();
        conditionalOperators.TypeCasting();

        Switch switchObject=new Switch();

        System.out.println("Switch:");
        switchObject.weekdays();

        Loops loops=new Loops();

        loops.doWhile();
        loops.ForLoop();
        loops.Patterns();
        loops.SwitchCase();
        loops.Break();

        Animal animal=new Animal();
        animal.AnimalSound();
        Animal myObj=new Animal.Pig();
        myObj.AnimalSound();
        Animal dogObj=new Animal.Dog();
        dogObj.AnimalSound();

        CarArrays arrays=new CarArrays();

        arrays.Car();

        ExecuteEnum executeEnum=ExecuteEnum.HIGH;
        System.out.println("Executing Enum:");
        System.out.println(executeEnum);

        AccessingClass myOuter=new AccessingClass();
        AccessingClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("Accessing Inner and outer class");
        System.out.println(myOuter.g+myInner.f);


        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) {
            System.out.println("Try catch method : Something went wrong.");
        }
    }
    }
