package com.company.Patterns;

import java.util.Scanner;

public class ExercisePattern2
{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();

        int m = ((n*2)-1);

        for (int i = 1; i <= m; i++)
        {
            if (i <= n)
            {
                for (int j = 1; j <= n; j++)
                {
                    if (j < i)
                    {
                        System.out.print(" ");
                    } else if (j == i)
                    {
                        System.out.print(i);
                    } else if (j > i && j <= n)
                    {
                        System.out.print(" ");
                    }
                }


            for (int j = n - 1; j >= 1; j--)
            {
                if (j == i)
                {
                    System.out.print(i);
                } else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
         if(i > n)
            {
                for (int j = n-1; j >= 1; j--)
                {
                    for (int k = 1; k <= n ; k++)
                    {
                        if (k < j)
                        {
                            System.out.print(" ");
                        }
                        else if (k == j)
                        {
                            System.out.print(j);
                        }
                        else if (k > j && k <= n)
                        {
                            System.out.print(" ");
                        }
                    }

                    for ( int k = n-1; k >= 1; k--)
                    {
                        if(k == j)
                        {
                            System.out.print(j);
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }

                    System.out.println();
                }

                return;
            }
        }
    }
}
