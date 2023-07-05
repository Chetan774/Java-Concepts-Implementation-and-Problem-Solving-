package com.company.ArraysLevel1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SubarraysOFArray {
    public static void main(String[] args) {
       char arr[] = {'a','b','c','d','e','f'};
        System.out.println(Arrays.toString(arr));

        subArrays(arr);
    }

    public static void subArrays(char arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i; j < arr.length; j++)
            {
                for (int k = i; k < j; k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }

        }
    }
}
