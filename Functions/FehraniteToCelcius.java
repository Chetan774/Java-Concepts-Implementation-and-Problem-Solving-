package com.company.Functions;

public class FehraniteToCelcius
{
    public static class solution
    {
        public static void FtoC(int n)
        {
            int ans  = ((n-32)*5)/9;
            System.out.println(ans);
        }
    }
    public static void main(String[] args)
    {
             int n = 20;
             solution.FtoC(n);
    }
}
