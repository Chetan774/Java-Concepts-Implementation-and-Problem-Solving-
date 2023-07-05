package com.company.Searching_And_Sorting_C;

import java.util.Arrays;

public class PushZerosTOEndBestApproach // less time complexity, best approach
{
    public  static void push0ToEnd(int arr[])
    {
        int k = 0;
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] > 0)
            {
                int  temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k++;
            }
            else //else if(arr[i] == 0)
            {
                i++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,0,4,8,1,3,0,7,2,0};
        push0ToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
