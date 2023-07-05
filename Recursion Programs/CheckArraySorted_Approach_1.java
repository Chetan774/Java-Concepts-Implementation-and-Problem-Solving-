package com.company.RecursionC;

public class CheckArraySorted_Approach_1
{
    public static boolean checkSorted (int input[])
    {
        if(input.length <= 1)
        {
            return true;
        }

        int SmallArray[] = new int[input.length-1];

        for(int i = 1; i < input.length; i++)
        {
            SmallArray[i-1] = input[i];
        }

        boolean SmallAns = checkSorted(SmallArray);

        if(!SmallAns)
        {
            return false;
        }
        else
        {
            if(input[0] <= input[1])
            {
                return  true;
            }
            else
            {
                return false;
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {7,2,3,4,5};
        System.out.println(checkSorted(arr));

    }
}
