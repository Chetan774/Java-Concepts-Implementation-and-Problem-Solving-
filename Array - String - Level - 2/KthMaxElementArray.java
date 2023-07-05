package com.company.DsaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxElementArray {
    public static void main(String[] args) {
        int arr[] ={55,44,33,22,11};

        bubbleSort(arr);
        System.out.println("Sorted array : "+ Arrays.toString(arr));

        System.out.println("Enter index : ");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        System.out.println( kthMax(arr, index));
    }

    static void bubbleSort(int arr [])
    {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length -i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }

        }
    }
    static int kthMax(int arr[],int index)
    {
        int max = 0;

        int counter = 0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > max) {
                max = arr[i];
                counter++;
            }
            if (counter == index)
            {
                break;
            }

        }
        return  max;
    }

}
