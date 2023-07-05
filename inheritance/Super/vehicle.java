package com.company.inheritance.Super;

public class vehicle
{
    int maxSpeed;
    String color;

    public void print()
    {
        System.out.println("maxSpeed : "+ maxSpeed);
        System.out.println("color : "+ color);
    }
}
class car extends vehicle
{
    int numGears;
    public void print()
    {
        super.print();//to execute the function written in parent(vehicle) class
        System.out.println("numGears : "+ numGears);
    }
}
class vehicleUse
{
    public static void main(String[] args)
    {
        car c= new car();
        c.maxSpeed = 100;
        c.color = "red";
        c.numGears = 10;
        c.print();
    }
}