package com.company.inheritance.Hierarchical;

//Hierarchical Inheritance
//When two or more classes inherits a single class, it is known as hierarchical inheritance.
public class hierarchicalMain {
    public static void main(String[] args) {
        System.out.println("Dog is : ");
     dog d1 = new dog();
     d1.eat();
     d1.bark();

        System.out.println("\nCat is : ");
     cat c1 = new cat();
     c1.eat();
     c1.meow();
    }
}
class animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Meowing...");
    }
}