package com.company.RecursionC;

import java.util.Arrays;

public class trangle_level_sum
{
    public static void printTrangle(int arr[])
    {
        if(arr.length == 1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int new_arr[] = new int[arr.length-1];

        for (int i = 0; i < arr.length-1; i++)
        {
            new_arr[i] = arr[i] + arr[i+1];
        }

        int prev_arr[] = new_arr;

        printTrangle(prev_arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String args[])
    {
        int arr[] =  {1,2,3,4,5};

        printTrangle(arr);
    }
}
