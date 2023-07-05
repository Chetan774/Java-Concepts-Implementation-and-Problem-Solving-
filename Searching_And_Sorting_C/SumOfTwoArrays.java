package com.company.Searching_And_Sorting_C;

import java.util.Arrays;

public class SumOfTwoArrays
{
    public static int ConvertToInt(int arr[])
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int r = arr[i] * (int)(Math.pow(10, arr.length-1-i));
            sum  = sum + r;
        }
        return sum;
    }
    public static int[] sumOfTwoArrays(int arr1[], int arr2[])
    {
        int int1 = ConvertToInt(arr1);
        int int2 = ConvertToInt(arr2);
        System.out.println("int1 : "  +int1);
        System.out.println("int2 : "  +int2);
        int sum = int1 + int2;
        System.out.println("sum : "  +sum);
        int n = sum;

        int k = 0;
        while(n > 0)
        {
            n = n/10;
            k++;
        }
         if(k < 4)
         {
             k = 4;
         }
        int output[] = new int[k];

        for(int i = k-1; i >= 0 ; i--)
        {
            int r  = sum % 10;

            if(sum < 10)
            {
                output[i]  = sum;
            }
            else
            {
                output[i]  = r;
            }

            sum = sum / 10;
        }
        System.out.println("k : "+k);
//        System.out.println(Arrays.toString(output));
        return output;
    }



    public static void main(String[] args)
    {
       int arr1[] = {6,9,8,5};
       int arr2[] = new int[0];

        System.out.println(Arrays.toString(sumOfTwoArrays(arr1,arr2)));

    }
}
