package com.company.Constructor;

public class student
{
     int rollNo;
     String  name;
     static int year;

     student(int rollNo,String name)
     {
         this.rollNo = rollNo;
         this.name = name;

     }
    public static void main(String[] args)
    {
       student s1 = new student(10,"a");
        s1.year = 2020;

        student s2 = new student(11,"b");
        s2.year = 2019;
        System.out.println(s1.year);
        System.out.println(s2.year);
    }
}