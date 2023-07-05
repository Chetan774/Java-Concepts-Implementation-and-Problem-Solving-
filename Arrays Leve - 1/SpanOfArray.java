package com.company.ArraysLevel1;

import java.util.Scanner;
//difference between max and min element in array
public class SpanOfArray {

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
        System.out.println(span(arr));

    }

    public static int span(int arr[])
    {
        int max=arr[0],min=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] >  max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        int result =  max-min;
        return result;
    }
}
