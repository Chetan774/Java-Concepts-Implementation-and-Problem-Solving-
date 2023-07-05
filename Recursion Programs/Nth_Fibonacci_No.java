package com.company.RecursionC;

public class Nth_Fibonacci_No
{
    public static int fibo(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int a  = fibo(n-1);
        int b = fibo(n-2);

        return a + b;
    }

    public static void main(String[] args) {
        int n =7;
        System.out.println(fibo(n));
    }
}
