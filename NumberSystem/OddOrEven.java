package com.company.NumberSystem;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 190;
        if((n & 1) == 1)
        {
            System.out.println(n + " is odd");
        }
        else
        {
            System.out.println(n+" is even");
        }

    }
}
