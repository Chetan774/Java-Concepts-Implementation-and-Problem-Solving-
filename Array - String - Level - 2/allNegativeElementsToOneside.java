package com.company.DsaQuestions;

import java.util.Arrays;

public class allNegativeElementsToOneside {
    public static void main(String[] args) {
        int arr[] = {-1,2,-2,4,-5,6,7,8,-9,-10,-20};
        rerrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void rerrange(int arr[])
    {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                if (i != j) {
                    swap(arr,i,j);
                }
             j++;
            }
        }

    }
    static void swap(int arr[],int first,int second )
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
