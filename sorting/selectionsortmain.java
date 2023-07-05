package com.company.sorting;

import java.util.Arrays;

public class selectionsortmain {
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            int  last = arr.length - i - 1;
            int start;
            int maxindex = getmaxinteger(arr,0, last);
            swap(arr,maxindex,last);

        }
    }

    static void swap(int arr[],int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

    static int getmaxinteger(int arr[],int start,int end)
    {
       int  max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i] )
            {
                max = i;
            }

        }
        return  max;
    }
}
