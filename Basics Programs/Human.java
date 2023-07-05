package com.company;

public class Human {
    int age;
    String name;
    int sallary;
    public static long population;
    public static void main(String[] args) {

    }
   public Human(int age,String  name,int sallary)
    {
        this.age = age;
        this.name = name;
        this.sallary = sallary;
        Human.population+=1;
    }
}
