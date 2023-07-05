package com.company.Searching_And_Sorting_C;

public class Imprment1_SecondLargestElement
{
    public static int SecondLargest(int arr[])
    {
        int max1 = arr[0];
        int max2 = 0;
        for (int i = 1; i < arr.length; i++)
        {
                if(max1 < arr[i])
                {
                    max1 = arr[i];
                }
        }

        for (int i = 0; i <arr.length ; i++)
        {
                if(arr[i] < max1)
                {
                    if(arr[i] >= max2)
                    {
                        max2 = arr[i];
                    }
                }
        }

        return max2;
    }

    public static void main(String[] args)
    {
      int arr[] = {2,13,4,1,3,6,28};
        System.out.println(SecondLargest(arr));
    }
}
