package com.company.ArraysLevel1;

import java.util.Arrays;

public class InverseOfArray {
    public static void main(String[] args) {
        int arr1[] = {3,4,1,2,0};
        System.out.println(Arrays.toString(arr1));

        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[arr1[i]] = i;
        }
        System.out.println(Arrays.toString(arr2));
//        System.out.println();

    }
}
