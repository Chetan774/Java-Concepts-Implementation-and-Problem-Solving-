package com.company.RecursionC;

public class Sum_Of_N_No
{
    public static int sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
