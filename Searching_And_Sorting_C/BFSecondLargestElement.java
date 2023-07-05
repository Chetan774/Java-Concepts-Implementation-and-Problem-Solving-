package com.company.Searching_And_Sorting_C;

public class BFSecondLargestElement
{
    public static int secondLargestElement(int[] arr)
    {
        int k = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                k++;
            }
        }

        if(arr.length <= 1 || k == arr.length-1)
        {
            return -2147483648;
        }
        else
        {
            for(int i = 0; i < arr.length-1; i++)
            {
                // bubble sort step1
                // last second element print
                for(int j = 0; j < arr.length-1-i; j++)
                {
                    if(arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] =  temp;
                    }

                }
            }

        }

        return arr[arr.length-2];

    }

    public static void main(String[] args)
    {
       int arr[] = {2,13,4,5,6,28};
        System.out.println( secondLargestElement(arr));

    }

}
