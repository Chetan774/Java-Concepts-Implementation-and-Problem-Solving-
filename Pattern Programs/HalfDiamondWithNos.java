package com.company.Patterns;

import java.util.Scanner;

public class HalfDiamondWithNos
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m =((n*2)-1);

        System.out.println("*");

        for (int i = 1; i <= m ; i++)
        {
            if(i <= n)
            {
                System.out.print("*");

                for (int j = 1; j <= i ; j++)
                {
                    System.out.print(j);
                }

                for (int j = i-1; j >=1 ; j--)
                {
                    System.out.print(j);
                }
                System.out.print("*");

                System.out.println();
            }
            if(i > n)
            {


                for (int j = n-1; j >= 1; j--)
                {
                    System.out.print("*");
                    int p = 0;
                    for (int k = 1; k <= j ; k++)
                    {
                        System.out.print(k);
                        p = p+1;
                    }

                    for(int k = p -1; k >= 1; k--)
                    {
                        System.out.print(k);
                    }

                    System.out.print("*");
                    System.out.println();
                }
                System.out.println("*");
                return;


            }


        }
    }
}
