package com.company.RecursionC;

public class Count_digits_In_No
{
    public static int count(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        return 1 + count(n/10);

    }

    public static void main(String[] args) {
        int n = 1398765;
        System.out.println(count(n));;
    }
}
