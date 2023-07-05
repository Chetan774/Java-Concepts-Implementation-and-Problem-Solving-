package com.company.Searching_And_Sorting_C;

public class Best_Approch_2ndLargest
{

    public static int ScndLargest(int arr[])
    {
        int L = -2147483648;
        int SL = -2147483648;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > L)
            {
               SL = L;
               L = arr[i];
            }
            else if( arr[i] == L)
            {
                continue;
            }
            else
            {
                if(arr[i] > SL)
                {
                   SL =  arr[i];
                }
            }
        }
        return SL;
    }

    public static void main(String[] args)
    {
         int arr[] = {2,2,2,2,2,2};
        System.out.println(ScndLargest(arr));
    }
}
