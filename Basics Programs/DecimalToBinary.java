package com.company;

public class DecimalToBinary
{
    public static void main(String[] args) {
        int n = 7;

        int count = 0;
        int sum = 0;

        while (n > 0)
        {
            int r = n % 2;

            sum  = sum + (((int)Math.pow(10,count))*r);
            count++;

            n = n / 2;
        }

        System.out.println(sum);
    }
}
