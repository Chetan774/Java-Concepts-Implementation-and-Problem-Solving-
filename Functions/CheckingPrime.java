package com.company.Functions;

public class CheckingPrime
{
    public  static boolean isPrime(int n)
    {
        for (int i = 2; i <= n/2; i++)
        {
           if(n % i == 0)
           {
               return false;
           }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int n = 10;
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
}
