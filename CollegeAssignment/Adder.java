package com.company.CollegeAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Adder {
    int arr[];
    int targetsum;

    public Adder(int arraysize)
    {
        arr = new int[arraysize];
        targetsum = 0;
    }

    public void getdata(int arraysize)
    {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arraysize; i++)
        {
          arr[i] = in.nextInt();
        }
        System.out.println("Enter targetsum : ");
        targetsum = in.nextInt();

    }
    public int[] numsum()
    {
        int result[] = new int[2];
        int x = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j <(arr.length); j++)
            {
             if(targetsum == arr[i] + arr[j] )
             {
                 result[0] = arr[i];
                 result[1] = arr[j];
                 x = 1;
             }
            }

        }
        if(x == 0)
        {
            result = new int[]{};
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter array size : ");
        Scanner in = new Scanner(System.in);
       int  arraysize = in.nextInt();

       Adder obj = new Adder(arraysize);
       obj.getdata(arraysize);
       int result1[] = new int [2];
        result1 = obj.numsum();

        System.out.print("Array elements are : ");
        System.out.println(Arrays.toString(result1));

    }
}
