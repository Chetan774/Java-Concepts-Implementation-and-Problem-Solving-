package com.company.Searching_And_Sorting_C;

import java.util.Arrays;

public class Best_SumTwoArraysJava
{
    public static int[] sum_2_arrays(int arr1[], int arr2[])
    {
        int i = arr1.length-1;
        int j = arr2.length-1;
        int size = 0;
        if(i > j)
        {
            size = arr1.length;
        }
        else
        {
            size = arr2.length;
        }

        int output[] = new int[size];
        int k = output.length-1;
        int carry  = 0;

        while (i >= 0 || j >= 0)
        {
            int d = carry;
            if(i >= 0)
            {
                d = d + arr1[i];
            }
            if(j >= 0)
            {
                d = d + arr2[j];
            }

            carry = d / 10;
            d = d % 10;

            output[k] = d;

            i--;
            j--;
            k--;
        }
        return output;
    }
    public static void main(String[] args)
    {
        int arr1[] = {1,1,1};
        int arr2[] = {2,2,2};
        System.out.println(Arrays.toString(sum_2_arrays(arr1,arr2)));
    }
}
