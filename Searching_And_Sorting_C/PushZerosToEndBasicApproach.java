package com.company.Searching_And_Sorting_C;

import java.util.Arrays;

public class PushZerosToEndBasicApproach
{
    public static void pushZerosAtEnd(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
            {
                continue;
            }
            else//else if(arr[i] == 0)
            {
                for(int j = i+1; j < arr.length; j++)
                {
                    if(arr[i] < arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args)
    {
         int arr[] = {1,0,2,0,4,5,0,9};
        pushZerosAtEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
