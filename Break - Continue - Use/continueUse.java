package com.company.BreakContinueUse;

public class continueUse
{
    public static void main(String[] args)
    {
        // use of continue in for loop
        for (int i = 1; i <= 10; i++)
        {
            if(i == 5)
            {
                continue;
            }
            System.out.println(i);
        }

        // use of continue in While loop
        int i  = 1;
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
