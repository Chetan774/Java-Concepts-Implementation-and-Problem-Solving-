package com.company.Abstraction;

public class Using_Abstract_Class {
    public static void main(String[] args) {
        car c = new car(4);
        scooter s = new scooter(2);
        c.start();
        s.start();
    }

   static abstract class vehicle//abstract class
    {
       int No_Of_Tyres;
        abstract void start();//abstract method
    }

    static class car extends vehicle
    {
        car(int No_Of_Tyres)
        {
            this.No_Of_Tyres = No_Of_Tyres;
        }
         void start()
         {
             System.out.println("car with "+No_Of_Tyres+" tyres Starts With key ");
         }
    }
    static class scooter extends vehicle
    {
        scooter(int No_Of_Tyres)
        {
            this.No_Of_Tyres = No_Of_Tyres;
        }
        void start()
        {
            System.out.println("scooter with "+No_Of_Tyres+" tyres Starts With key ");
        }
    }
}
