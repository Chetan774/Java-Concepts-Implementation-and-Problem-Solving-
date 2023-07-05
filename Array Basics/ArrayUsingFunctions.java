package com.company.ArrayC;

import java.util.Scanner;

public class ArrayUsingFunctions
{
    public static int [] ArrayInput()
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void PrintArray(int arr[])
    {
        int size = arr.length;
        System.out.println("The elements in array are : ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int LargestElementInArray(int arr[])
    {
        int max = Integer.MIN_VALUE;
        System.out.println("Max Before : "+ max);
        for(int i = 0; i < arr.length; i++)
        {
             if(arr[i] > max)
             {
                 max = arr[i];
             }
             else
             {
                 continue;
             }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int arr[] = ArrayInput();
        PrintArray(arr);
        int largest = LargestElementInArray(arr);
        System.out.println("Largest element in array is : " + largest);

    }
}
