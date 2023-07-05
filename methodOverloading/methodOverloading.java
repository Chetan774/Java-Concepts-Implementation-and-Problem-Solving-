package com.company.methodOverloading;

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println(adder.add(1,2));
        System.out.println(adder.add(1,2.0));

    }

}
class adder{
    static int add(int a, int b)
    {
        return  a + b;
    }

    static double add(double a,double b)
    {
        return  a+b;
    }
}
