package com.company.BreakContinueUse;

public class continueConfusion
{
    public static void main(String[] args)
    {
        int arr[] = {5,0,7,4,5,0,9,0,0,-7};
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                System.out.println(i);
            }
            else
            {
                if(arr[i] == 0)
                {
                    continue;
                }
                else
                {
                    System.out.println(i);
                }
            }
        }
    }
}
