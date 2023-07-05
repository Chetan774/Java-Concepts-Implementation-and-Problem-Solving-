package com.company.RecursionC;

public class max_min_element_In_Array
{

           static int max = Integer.MIN_VALUE;
           static int min = Integer.MAX_VALUE;

    public static void Print_Min_Max(int arr[], int i)
    {

        if(i == arr.length)
        {
            System.out.println("Max : "+ max +" "+ "Min : "+ min);
            return;

        }

        if(arr[i] > max)
        {
            max = arr[i];
        }

        if(arr[i] < min )
        {
            min = arr[i];
        }

        Print_Min_Max(arr,i+1);

    }

    public static void main(String[] args) {



        int arr[] = {1,2,3,4,-5};

        Print_Min_Max(arr,0);

    }
}
