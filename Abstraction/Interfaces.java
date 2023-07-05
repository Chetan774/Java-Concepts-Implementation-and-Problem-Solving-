package com.company.Abstraction;

public class Interfaces {
    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.display_name();
        i2.display_sirname();

    }
    // multiple inheritance is possible in interfaces
    interface i1
    {
        public static final String name = "Chetan";

        public abstract void show();

        default void display_name() {
            System.out.println("My name is : "+name);
        }


    }
    interface i2{
        public static final String sirname = "Patil";
        static void display_sirname() {
            System.out.println("My sirname is : " + sirname);
        }
    }

    static class test implements i1,i2{
        public void show()
        {
            System.out.println("Im test class");
        }



    }
}
