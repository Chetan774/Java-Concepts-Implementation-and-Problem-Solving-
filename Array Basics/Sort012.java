package com.company.ArrayC;

import java.util.Arrays;

public class Sort012
{
    public static void sort(int[] arr)
    {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                count1++;
            }
            else if( arr[i] == 2)
            {
                count2++;
            }
            else if( arr[i] == 0)
            {
                count3++;
            }

        }
        int k = 0;
        while (k < arr.length)
        {
            if(k < count3)
            {
                arr[k] = 0;
            }
            else if(k >= count3 && k < arr.length-count2)
            {
                arr[k] = 1;
            }
            else if(k >= arr.length-count2)
            {
                arr[k] = 2;
            }
            k++;
        }


    }
    public static void main(String[] args)
    {
        int arr[] = {1,0,1,2,0,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
