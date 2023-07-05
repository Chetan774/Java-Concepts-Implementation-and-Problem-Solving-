package com.company.ArraysLevel1;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
        System.out.println("Before Rotation : ");
        System.out.println(Arrays.toString(arr));
    rotate(arr,3);
        System.out.println("After Rotation : ");
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int arr[], int i,int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate(int arr[],int k)
    {
        k = k % arr.length;
                if(k < 0)
                {
                    k = k + arr.length;
                }
        //reverse of part 1
        reverse(arr,0, arr.length-k-1);
        //reverse of part 2
        reverse(arr,arr.length-k, arr.length-1);
        //reverse of whole array
        reverse(arr,0,arr.length-1);
    }
}
