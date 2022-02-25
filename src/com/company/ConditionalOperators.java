package com.company;
public class ConditionalOperators {
    public void dayCount() {
        int day = 5;
        String result = (day < 7) ? "Good day" : "Bad day";
        System.out.println("Conditional operators:"+result);
    }
    public void TypeCasting(){
        double value=10.6;
        int myInt=(int)value;
        System.out.println(value+" double to int : "+ myInt);
    }
}
