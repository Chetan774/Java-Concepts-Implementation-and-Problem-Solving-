package com.company.inheritance.C;

public class vehicle
{
    private int maxSpeed;
    String color;

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    public void print()
    {
        System.out.println("vehicleInfo : ");
        System.out.println("maxSpeed of vehicle : "+ getMaxSpeed());
        System.out.println("color of vehicle : "+ color);
    }
}
 class car extends vehicle
{
    int numGears;
    public void print()
    {
        System.out.println("carInfo : ");
        System.out.println("maxSpeed : "+ this.getMaxSpeed());
        System.out.println("Color : "+ this.color);
        System.out.println("numGears : "+ this.numGears);
    }
}

class vehicleUse
{
    public static void main(String[] args)
    {
        vehicle v1 = new vehicle();
        v1.setMaxSpeed(20);
        v1.color = "black";
        v1.print();

        System.out.println();
        System.out.println();

        car c = new car();
        c.setMaxSpeed(10);
        c.color = "red";
        c.numGears = 8;
        c.print();


    }
}


