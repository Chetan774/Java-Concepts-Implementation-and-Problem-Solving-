package com.company.BreakContinueUse;

public class BreakUse
{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {

            System.out.print(i+" ");

            for (int j = 1; j <= 5 ; j++)
            {

                if(j >= 3)
                {
                    break;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
