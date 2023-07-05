package com.company.RecursionC;

public class Recursive_binary_search {

    public static int binary_search(int arr[], int target, int si, int ei)
    {
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei) / 2;

        if (arr[mid] == target)
        {
            return mid;
        }


        if( arr[mid] > target)
        {
            return binary_search(arr, target, si, mid - 1);
        }
        else
        {
            return binary_search(arr, target, mid+1, ei);
        }



    }


    public static void main(String[] args)
    {
           int arr[] = {-1,0,3,5,9,12};

           int x = binary_search(arr,9,0,arr.length-1);

        System.out.println(x);
    }
}
