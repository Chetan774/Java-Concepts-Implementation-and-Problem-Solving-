package com.company.Patterns;

import java.util.Scanner;

public class ExercisePattern
{
    public static void main(String[] args)
    {
      Scanner s  = new Scanner(System.in);
      int n = s.nextInt();

        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n ; j++)
            {
                if (j < i)
                {
                    System.out.print(" ");
                }
                else if (j == i)
                {
                    System.out.print(i);
                }
                else if (j > i && j <= n)
                {
                    System.out.print(" ");
                }
            }

                for ( int j = n-1; j >= 1; j--)
                {
                    if(j == i)
                    {
                        System.out.print(i);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }

                System.out.println();

        }



    }
}




