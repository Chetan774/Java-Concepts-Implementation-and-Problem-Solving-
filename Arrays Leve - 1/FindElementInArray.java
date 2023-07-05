package com.company.ArraysLevel1;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter element to find : ");
        int element = in.nextInt();
        System.out.println(indexOfElement(arr,element));
    }

    public static int indexOfElement(int arr[],int element)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }

        return -1;
    }
}
