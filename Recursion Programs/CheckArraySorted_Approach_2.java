package com.company.RecursionC;

public class CheckArraySorted_Approach_2
{
    public static boolean checkSorted_2(int input[])
    {
        if(input.length <= 1)
        {
            return true;
        }
        if(input[0] > input[1])
        {
            return false;
        }

        int SmallArray[] = new int[input.length-1];

        for (int i = 1; i < input.length; i++)
        {
            SmallArray[i-1] = input[i];

        }

        boolean SmallAns = checkSorted_2(SmallArray);

        if(SmallAns)// if(smallAns == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        System.out.println(checkSorted_2(arr));

    }
}
