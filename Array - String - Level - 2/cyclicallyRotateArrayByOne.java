package com.company.DsaQuestions;


import java.util.Arrays;

public class cyclicallyRotateArrayByOne {
    public static void main(String[] args) {
        int arr[] ={11,34,23,54,22};
        System.out.println("Before cyclic rotation : ");
        System.out.println(Arrays.toString(arr));
        cyclicRotate(arr);
        System.out.println("After cyclic rotation : ");
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicRotate(int arr[])
    {
        int x = arr[arr.length-1];
        for (int i = arr.length-1;i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;

    }
}
