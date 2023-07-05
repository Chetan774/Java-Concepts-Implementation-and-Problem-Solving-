package com.company.BreakKeyword;

import java.util.Scanner;

public class ContinueKeyword
{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();

        //using for loop
        for (int i = 1; i <= n; i++)
        {

            if(i == 5)
            {
                continue;
            }
            System.out.println(i);
        }

       // using While
        int i = 1;

        while (i <= 10)
        {
            if(i == 5)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
