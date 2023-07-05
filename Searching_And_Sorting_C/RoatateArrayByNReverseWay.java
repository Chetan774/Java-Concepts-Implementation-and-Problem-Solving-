package com.company.Searching_And_Sorting_C;

import java.util.Arrays;

public class RoatateArrayByNReverseWay
{


    public static void Rotate_By_d(int arr[], int d)
    {
        //Step-1 :  reversing the whole array
        int i = 0;
        int j = arr.length-1;

        while (i <= j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Step-2 :  reversing the array till arr.length-d-1

        i = 0;
        j = arr.length-d-1;

        while (i <= j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Step-3 :  reversing the array from  arr.length+d to arr.length-1

        i = arr.length-d;
        j = arr.length-1;

        while (i <= j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args)
    {
       int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));

        int d = 2;
        System.out.println("After shifting by "+ d);
        Rotate_By_d(arr,d);
        System.out.println(Arrays.toString(arr));

    }
}
