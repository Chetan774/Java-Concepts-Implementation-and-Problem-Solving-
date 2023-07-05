package com.company.BitManipulation;

public class OddnEven
{

    public static void checkOddEven(int n)
    {
        int bitmask = 1;

        if((n & bitmask) == 0)
        {
            System.out.println(n + " is Even Number");
        }
        else
        {
            System.out.println(n + " is odd Number");
        }
    }
    public static void main(String[] args)
    {
        int n = 10;

        checkOddEven(9);
    }
}
