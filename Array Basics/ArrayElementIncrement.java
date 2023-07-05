package com.company.ArrayC;

import java.util.Arrays;

public class ArrayElementIncrement
{
    public static void IncrementArrayElements(int arr[])
    {
        arr = new int[5];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i]++;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Before Increment : ");
        System.out.println(Arrays.toString(arr));

        IncrementArrayElements(arr);

        System.out.println("After Increment : ");
        System.out.println(Arrays.toString(arr));
    }
}
