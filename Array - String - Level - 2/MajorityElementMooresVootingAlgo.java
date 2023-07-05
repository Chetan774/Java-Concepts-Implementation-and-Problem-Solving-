package com.company.ArrayStringLevel2;

import java.util.Scanner;

public class MajorityElementMooresVootingAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
           arr[i] = in.nextInt();
        }

        MajorityElement(arr);
    }

    public static void MajorityElement(int arr[])
    {
        int value = ValidCandidate(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
         if(arr[i] == value)
         {
             count++;
         }
        }

        if(count > arr.length/2)
        {
            System.out.println(value);
        }
        else
        {
            System.out.println("No Majority Element Found");
        }

    }
    public static int ValidCandidate(int arr[])
    {
        int val  = arr[0];
        int count = 1;

        for (int i = 1; i <arr.length; i++)
        {
            if(val  ==  arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }

            if(count == 0)
            {
                val = arr[i];
                count = 1;
            }
        }

        return val;
    }
}
