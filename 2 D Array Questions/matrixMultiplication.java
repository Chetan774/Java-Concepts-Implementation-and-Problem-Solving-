package com.company.TwoDArraysLevel1;

public class matrixMultiplication {
    public static void main(String[] args) {
        int arr1[][] = {{10,10},{10,10}};
        int arr2[][] = {{10,10,10},{10,10,10}};
        int arr3[][] = new int[arr1.length][arr2[0].length];

        if(arr1[0].length != arr2.length)
        {
            System.out.println("Multiplication is not possible");
            return;
        }

        for (int i = 0; i < arr3.length; i++)
        {
            for (int j = 0; j < arr3[0].length; j++)
            {
                for (int k = 0; k < arr1[0].length; k++)
                {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < arr3.length; i++)
        {
            for (int j = 0; j < arr3[0].length; j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();

        }


    }
}
