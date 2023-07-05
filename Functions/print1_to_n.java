package com.company.Functions;

import java.util.Scanner;

public class print1_to_n
{
    public static void print1toN(int n)
    {
        if(n <= 0)
        {
            return;
        }
        for (int i = 1; i <= n ; i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        print1toN(n);
    }
}
