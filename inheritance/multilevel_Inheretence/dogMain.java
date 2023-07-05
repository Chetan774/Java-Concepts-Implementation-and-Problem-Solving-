package com.company.inheritance.multilevel_Inheretence;
//Multilevel inheritance
public class dogMain {
    public static void main(String[] args) {
      babyDog d1 = new babyDog();
      d1.eat();
      d1.bark();
      d1.Weep();
    }
}
class animal{
    void eat()
    {
        System.out.println("Eating.....");
    }
}
class dog extends  animal
{
    void bark()
    {
        System.out.println("Barking.....");
    }
}
class babyDog extends  dog
{
    void Weep()
    {
        System.out.println("Weeping.....");
    }
}
