package com.company;

public class BinaryToDecimal
{
    public static void main(String[] args)
    {
        int n = 111;

        int count  = 0;
        int sum = 0;
        while (n > 0)
        {
          int r = n % 10;
          sum = sum + (((int)Math.pow(2,count))*r);
          count++;
          n = n /10;
        }
        System.out.println(sum);


    }


}
