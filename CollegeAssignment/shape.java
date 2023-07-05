package com.company.CollegeAssignment;

import java.util.Scanner;

public class shape
{
    float height;
    float base;
    float radius;
    float side;
    float area;
    final double pi = 3.14;

    public void getInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Triangle");
        System.out.println("Enter height : ");
        height = in.nextInt();
        System.out.println("Enter base : ");
        base = in.nextInt();

        System.out.println("Circle");
        System.out.println("Enter radius :");
        radius = in.nextInt();

        System.out.println("Square ");
        System.out.println("Enter side : ");
        side = in.nextInt();

    }
    float setArea()
    {
        return area;
    }
}
