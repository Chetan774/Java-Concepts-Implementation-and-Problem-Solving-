package com.company.DsaQuestions;

import java.util.Arrays;

public class sortWithoutSortingAlgo {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[])
    {
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == 0)
            {
                countzero++;

            }

           else if(arr[i] == 1)
            {
                countone++;

            }
            else if(arr[2] == 2)
            {
                counttwo++;
            }
        }

        for (int i = 0; i < countzero; i++) {

          arr[i] = 0;
        }

        for (int i = countzero; i < countzero + countone; i++) {
            arr[i] = 1;
        }

        for (int i = countzero + countone; i < arr.length; i++) {
            arr[i] = 2;
        }
    }
}
