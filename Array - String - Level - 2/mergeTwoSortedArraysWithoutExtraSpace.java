package com.company.DsaQuestions;

import java.util.Arrays;

public class mergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        int arr1[] = {1,4,8,10};
        int arr2[] = {2,3,9};
        System.out.println("Before Merging : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        AfterMerge(arr1,arr2);
        System.out.println("After Merging : ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void AfterMerge(int arr1[], int arr2[])
    {
        int size = arr1.length + arr2.length;
        int arr3[] = new int[size];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[k++] = arr1[i];

        }
        for (int j = 0; j < arr2.length; j++) {

            arr3[k++] = arr2[j];
        }

        Arrays.sort(arr3);
         k = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr3[k++];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr3[k++];
        }

    }
}

